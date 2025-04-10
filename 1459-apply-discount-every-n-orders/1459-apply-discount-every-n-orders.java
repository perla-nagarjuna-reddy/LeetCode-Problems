class Cashier {
    int total;
    HashMap<Integer,Integer> map;
    int[] price;
    int count = 0;
    int dis;
    public Cashier(int n, int discount, int[] products, int[] prices) {
        total = n;
        dis = discount;
        int s = products.length;
        price = new int[s];
        map = new HashMap<>();

        for(int i = 0 ; i < s; i++){
            map.put(products[i],i);
            price[i] = prices[i];
        }
    }
    
    public double getBill(int[] product, int[] amount) {
        count++;

        double totalSum = 0;

        for(int i = 0; i < product.length; i++){

            int getAmount = price[map.get(product[i])];

            totalSum = totalSum + (getAmount * amount[i]);

        }

        if(count == total){
            double finalBill =((double)(100-dis) / 100) * totalSum;
            count = 0;
            return finalBill;
        }

        return totalSum;
    }
}

/**
 * Your Cashier object will be instantiated and called as such:
 * Cashier obj = new Cashier(n, discount, products, prices);
 * double param_1 = obj.getBill(product,amount);
 */