class Solution {
    public int gcdOfOddEvenSums(int n) {
        
        int evenSum = n * (n+1);

        int oddSum = n * n;

        return toFindGcd(evenSum,oddSum);
    }

    public int toFindGcd(int num1, int num2){

        if(num2 == 0){
            return num1;
        }

        return toFindGcd(num2, num1 % num2);
    }
}