class CustomStack {
    int[] arr;
    int n;
    int ind;
    public CustomStack(int maxSize) {
        arr = new int[maxSize];
        n = maxSize;
        ind = 0;
    }
    
    public void push(int x) {
        if(ind < n){
            arr[ind++] = x;
        }
        // System.out.println(arr[ind-1]);
    }
    
    public int pop() {
        if(ind > 0){
            int val = arr[ind-1];
            System.out.println(val);
            arr[ind-1] = 0;
            ind--;
            return val;
        }
        return -1;
    }
    
    public void increment(int k, int val) {
        int limit = Math.min(ind,k);
        for(int i=0;i<limit;i++){
            arr[i] = arr[i]+val;
            // System.out.println(arr[i]);
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */