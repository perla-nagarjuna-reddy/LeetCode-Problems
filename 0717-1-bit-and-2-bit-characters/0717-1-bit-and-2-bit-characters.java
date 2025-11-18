class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        
        int n = bits.length;

        int sum = 0;

        for(int i = 0; i < n;){

            if(i == n - 1) return true;

            if(bits[i] == 1) {
                i+=2;
            }
            else if(bits[i] == 0){
                i+=1;
            }
        }
        return false;
    }
}