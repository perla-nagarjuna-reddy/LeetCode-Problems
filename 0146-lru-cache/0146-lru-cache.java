class Pair{
    int key;
    int val;
    Pair(int key,int val){
        this.key = key;
        this.val = val;
    }
}
class LRUCache {
    HashMap<Integer,Pair> map;
    Deque<Pair> q;
    int c;
    public LRUCache(int capacity) {
        c = capacity;
        map = new HashMap<>();
        q = new LinkedList<>();
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            Pair pair = map.get(key);
            q.remove(pair);
            q.addFirst(pair);
            return map.get(key).val;
        }

        return -1;
    }
    
    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Pair pair = map.get(key);
            q.remove(pair); // Remove the old pair from the queue
            pair.val = value; // Update the value
            q.addFirst(pair); // Add it back to the front
        } else {
            Pair pair = new Pair(key, value);
            if (q.size() >= c) {
                Pair last = q.pollLast();
                map.remove(last.key);
            }
            q.addFirst(pair);
            map.put(key, pair);
        }

    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */