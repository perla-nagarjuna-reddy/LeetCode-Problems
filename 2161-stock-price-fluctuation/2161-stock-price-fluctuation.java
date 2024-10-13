
class StockPrice {
    HashMap<Integer,Integer> map;
    HashMap<Integer,Integer> priceCount;
    PriorityQueue<Integer> pq ;
    PriorityQueue<Integer> pq1 ;
    List<Integer> ls;
    int latestTimestamp;
    public StockPrice() {
        map = new HashMap<>();
        priceCount = new HashMap<>();
        pq = new PriorityQueue<>();
        pq1 = new PriorityQueue<>(Collections.reverseOrder());
        latestTimestamp = 0;
    }
    
    public void update(int timestamp, int price) {
        latestTimestamp = Math.max(latestTimestamp, timestamp);
        if(map.containsKey(timestamp)){
            int oldPrice = map.get(timestamp);
            priceCount.put(oldPrice, priceCount.getOrDefault(oldPrice, 0) - 1);
        }
        map.put(timestamp,price);
        pq.add(price);
        pq1.add(price);
        priceCount.put(price, priceCount.getOrDefault(price, 0) + 1);
    }
    
    public int current() {
        return map.get(latestTimestamp);
    }
    
    public int maximum() {
        while (!pq1.isEmpty() && priceCount.get(pq1.peek()) == 0) {
            pq1.poll();
        }
        if(!pq1.isEmpty()){
            return pq1.peek();
        }
        return pq1.isEmpty() ? -1 : pq1.peek();
    }
    
    public int minimum() {
        while (!pq.isEmpty() && priceCount.get(pq.peek()) == 0) {
            pq.poll();  // Remove outdated elements
        }
        if(!pq.isEmpty()){
            return pq.peek();
        }
        return pq.isEmpty() ? -1 : pq.peek();
    }
}

/**
 * Your StockPrice object will be instantiated and called as such:
 * StockPrice obj = new StockPrice();
 * obj.update(timestamp,price);
 * int param_2 = obj.current();
 * int param_3 = obj.maximum();
 * int param_4 = obj.minimum();
 */