class Solution {
    public boolean isPowerOfThree(int n) {
        if(n == 1) {
            return true;
        }
        return isPower(1l,n);
    }

    boolean isPower(Long n,int target){
        if(n > target){
            return false;
        }
        n = n * 3;
        if(n == target){
            return true;
        }
        return isPower(n, target);
    }
}