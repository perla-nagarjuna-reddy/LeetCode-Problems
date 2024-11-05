class Solution {
    public double calculateTax(int[][] brackets, int income) {
        double ans = 0.0;
        int prev = 0;
        for(int i=0;i<brackets.length;i++){
            int current = Math.min(brackets[i][0] - prev, income);
            ans = ans + ((current*brackets[i][1]) / 100.0); 
            income = income - current;
            prev = brackets[i][0];
            if (income <= 0) break;
        }

        return ans;
    }
}