class Solution {
    public int smallestEvenMultiple(int n) {
        int val = n * 2;

        for(int i=1;i<=val;i++){
            if(i % 2 == 0 && i % n == 0){
                return i;
            }
        }
        return -1;
    }
}