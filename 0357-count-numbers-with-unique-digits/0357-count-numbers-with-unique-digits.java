class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        

        if(n == 0) return 1;

        int count = 10; 
        int product = 9;

        // For numbers of length 2 to n
        for (int i = 2; i <= n; i++) {
            product *= (11 - i);
            count += product;
        }
        return count;
    }
}