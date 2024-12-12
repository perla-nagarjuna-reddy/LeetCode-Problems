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

        for(int i=0;i<lst.size();i++){
            if(lst.get(i) >= start && lst.get(i) <=  end){
                count++;
            }
            // else{
            //     lst.remove(i);
            // }
        }

        return count;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */