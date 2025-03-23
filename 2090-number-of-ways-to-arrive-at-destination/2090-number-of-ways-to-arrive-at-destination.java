import java.util.*;

class Pair {
    long dist;
    int val;

    public Pair(long dist, int val) {
        this.dist = dist;
        this.val = val;
    }
}

class Solution {
    public int countPaths(int n, int[][] roads) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());

        for (int[] road : roads) {
            int first = road[0], second = road[1], third = road[2];
            adj.get(first).add(new Pair(third, second));
            adj.get(second).add(new Pair(third, first));
        }

        long[] dist = new long[n];
        int[] ways = new int[n];
        Arrays.fill(dist, Long.MAX_VALUE);
        Arrays.fill(ways, 0);

        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingLong(x -> x.dist));

        dist[0] = 0;
        ways[0] = 1;
        pq.add(new Pair(0, 0));

        int mod = (int) (1e9 + 7);

        while (!pq.isEmpty()) {
            Pair pair = pq.poll();
            int node = pair.val;
            long distance = pair.dist;

            if (distance > dist[node]) continue; // Skip outdated entries

            for (Pair adjPair : adj.get(node)) {
                int adjNode = adjPair.val;
                long newDist = distance + adjPair.dist;

                if (newDist < dist[adjNode]) {
                    dist[adjNode] = newDist;
                    pq.add(new Pair(newDist, adjNode));
                    ways[adjNode] = ways[node]; // Reset path count
                } else if (newDist == dist[adjNode]) {
                    ways[adjNode] = (ways[adjNode] + ways[node]) % mod;
                }
            }
        }
        return ways[n - 1];
    }
}
