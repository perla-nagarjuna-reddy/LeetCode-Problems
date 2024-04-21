class Solution {
    
    public int subtractProductAndSum(int n) {
        ArrayList<Integer> ans = getProduct(n);
        return ans.get(0) - ans.get(1);
    }

    
    public ArrayList<Integer> getProduct(int n){
        int product = 1;
        int sum = 0;
        while(n > 0){
            int digit = n % 10;
            sum+=digit;
            product*=digit;
            n=n/10;
        }
        System.out.println(sum +" "+product);
        ArrayList<Integer> fin = new ArrayList<>();
        fin.add(product);
        fin.add(sum);
        return fin;
    }
}