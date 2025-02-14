class ProductOfNumbers {
    List<Long> lst;
    public ProductOfNumbers() {
        lst = new ArrayList<>();
    }
    
    public void add(int num) {
        lst.add((long)num);
    }
    
    public int getProduct(int k) {
        if(lst.size() >= k){
            long prod = 1;
            int n = lst.size() - 1;
            for(int i = 0 ; i < k ;i++){
                prod = prod * lst.get(n - i);
            }

            return (int) prod;
        }

        return 0;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */