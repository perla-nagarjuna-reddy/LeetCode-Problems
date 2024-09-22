class Solution {
    public List<Integer> getRow(int n){
        List<Integer> ansRow = new ArrayList<>();
        n = n+1;
        long ans = 1;
        ansRow.add((int)ans);
        for (int i = 1; i < n; i++) {
            ans = ans * (n - i);
            ans = ans / i;
            // ansRow.add(ans);
            ansRow.add((int) ans);
        }
        return ansRow;
    }
}