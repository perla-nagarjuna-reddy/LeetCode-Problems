class StockSpanner {
    ArrayList<Integer>arr;
    public StockSpanner() {
        arr = new ArrayList<>();
    }
    
    public int next(int price) {
        int count = 0;
        arr.add(price);
        if(arr.size() == 1){
            return 1;
        }
        else{
            for(int i=arr.size()-1;i>=0;i--){
                if(arr.get(i) <= price){
                    count++;
                }
                else{
                    break;
                }
            }
        }
        return count;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */