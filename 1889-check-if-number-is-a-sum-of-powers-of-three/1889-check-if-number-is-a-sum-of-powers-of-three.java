class Solution {
    public boolean checkPowersOfThree(int n) {
        
        while(n != 0){

            int rem = n % 3;

            if(rem == 2) return false;

            int div = n / 3;

            n = div;
        }
            return true;
    }
}