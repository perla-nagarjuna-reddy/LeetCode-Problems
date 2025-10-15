class Solution {
    public int gcdOfOddEvenSums(int n) {
        
        int evenSum = 0;

        int oddSum = 0;

        for(int i = 1; i <= 2 * n; i++){

            if(i % 2 == 0){
                evenSum+=i;
            }
            else{
                oddSum+=i;
            }
        }
        return toFindGcd(evenSum,oddSum);
    }

    public int toFindGcd(int num1, int num2){

        if(num2 == 0){
            return num1;
        }

        return toFindGcd(num2, num1 % num2);
    }
}