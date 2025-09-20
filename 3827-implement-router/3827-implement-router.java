import java.util.*;

class Packet {
    int source;
    int destination;
    int timeStamp;

    public Packet(int source,int destination, int timeStamp){
        this.source = source;
        this.destination = destination;
        this.timeStamp = timeStamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Packet)) return false;
        Packet p = (Packet) o;
        return source == p.source && destination == p.destination && timeStamp == p.timeStamp;
    }

    @Override
    public int hashCode() {
        return Objects.hash(source, destination, timeStamp);
    }
}

class Router {
    Queue<Packet> q;
    int n;
    Set<Packet> set;

    Map<Integer, ArrayList<Integer>> timeIndex;

    public Router(int memoryLimit) {
        q = new LinkedList<>();
        set = new HashSet<>();
        n = memoryLimit;
        timeIndex = new HashMap<>();
    }

    public boolean addPacket(int source, int destination, int timestamp) {
        Packet newPacket = new Packet(source, destination, timestamp);

        if (set.contains(newPacket)) return false;

        if (q.size() >= n) {
            Packet removed = q.poll();
            if (removed != null) {
                set.remove(removed);
                ArrayList<Integer> list = timeIndex.get(removed.destination);
                if (list != null) list.remove(0);
            }
        }

        q.add(newPacket);
        set.add(newPacket);

        timeIndex.putIfAbsent(destination, new ArrayList<>());
        timeIndex.get(destination).add(timestamp);

        return true;
    }

    public int[] forwardPacket() {
        if (!q.isEmpty()) {
            Packet pack = q.poll();
            set.remove(pack);

            ArrayList<Integer> list = timeIndex.get(pack.destination);
            if (list != null) list.remove(0);

            return new int[]{pack.source, pack.destination, pack.timeStamp};
        }
        return new int[0];
    }

    public int getCount(int destination, int startTime, int endTime) {
        if (!timeIndex.containsKey(destination)) return 0;

        ArrayList<Integer> list = timeIndex.get(destination);
        
        int left = 0, right = list.size() - 1;
        int startIdx = list.size();
        while (left <= right) {
            int mid = (left + right) / 2;
            if (list.get(mid) >= startTime) {
                startIdx = mid;
                right = mid - 1;
            } else left = mid + 1;
        }

        left = 0;
        right = list.size() - 1;
        int endIdx = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (list.get(mid) <= endTime) {
                endIdx = mid;
                left = mid + 1;
            } else right = mid - 1;
        }

        return Math.max(0, endIdx - startIdx + 1);
    }
}
