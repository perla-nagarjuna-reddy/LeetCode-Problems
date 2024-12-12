class RecentCounter {
    ArrayList<Integer> lst;
    public RecentCounter() {
        lst = new ArrayList<>();
    }
    
    public int ping(int t) {
        int count = 0;
        int start = t - 3000;
        int end = t;
        lst.add(t);

        for(int i=lst.size() - 1;i >= 0;i--){
            if(lst.get(i) >= start && lst.get(i) <=  end){
                count++;
            }
            else{
                return count;
            }
        }

        return count;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */