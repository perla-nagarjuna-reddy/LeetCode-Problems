class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> sol = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            sol.add(generateRow(i));
        }

        return sol;
        
    }
    public List<Integer> generateRow(int row){
        int ans = 1;
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(1);
        for(int i=1;i<row;i++){
            ans = ans * (row-i);
            ans = ans / i;
            ansRow.add(ans);
        }

        return ansRow;
    }
}