class Node{
    int key;
    int val;
    Node next;
    Node prev;
    Node(int key,int val){
        this.key = key;
        this.val = val;
    }
}

class LRUCache {
    int cap ;
    HashMap<Integer,Node> map;
    Node head = new Node(-1,-1);
    Node tail = new Node(-1,-1);
    public LRUCache(int capacity) {
        cap = capacity;
        map = new HashMap<>();
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(map.containsKey(key)) {
            Node temp = map.get(key);
            deleteNode(temp);
            insertAfterHead(temp);
            return temp.val;
        }
        else{
            return -1;
        }
        
    }
    
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node temp = map.get(key);
            temp.val = value;
            deleteNode(temp);
            insertAfterHead(temp);
        }else{
            if(map.size() == cap){
                Node node = tail.prev;
                map.remove(node.key);
                deleteNode(node);
            }
            Node newNode = new Node(key,value);
            map.put(key,newNode);
            insertAfterHead(newNode);
        }
    }
    public void deleteNode(Node temp){
        Node prevNode = temp.prev;
        Node afterNode = temp.next;
        prevNode.next = afterNode;
        afterNode.prev = prevNode;
    }
    public void insertAfterHead(Node temp){
        Node afterNode = head.next;
        head.next = temp;
        temp.prev = head;
        temp.next = afterNode;
        afterNode.prev = temp;
    }
}
// class LRUCache {
//     HashMap<Integer,Pair> map;
//     Deque<Pair> q;
//     int c;
//     public LRUCache(int capacity) {
//         c = capacity;
//         map = new HashMap<>();
//         q = new LinkedList<>();
//     }
    
//     public int get(int key) {
//         if(map.containsKey(key)){
//             Pair pair = map.get(key);
//             q.remove(pair);
//             q.addFirst(pair);
//             return map.get(key).val;
//         }

//         return -1;
//     }
    
//     public void put(int key, int value) {
//         if (map.containsKey(key)) {
//             Pair pair = map.get(key);
//             q.remove(pair); 
//             pair.val = value;
//             q.addFirst(pair);
//         } else {
//             Pair pair = new Pair(key, value);
//             if (q.size() >= c) {
//                 Pair last = q.pollLast();
//                 map.remove(last.key);
//             }
//             q.addFirst(pair);
//             map.put(key, pair);
//         }

//     }
// }

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */