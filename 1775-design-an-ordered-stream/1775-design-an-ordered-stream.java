class OrderedStream {
    String[] arr ;
    int pointer = 0;
    public OrderedStream(int n) {
        this.arr = new String[n];
    }
    
    public List<String> insert(int idKey, String value) {

        arr[idKey - 1] = value;
        

        List<String> ans = new ArrayList<>();

        while(pointer < arr.length && arr[pointer] != null){
            ans.add(arr[pointer]);
            pointer++;
        }

        return ans;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */