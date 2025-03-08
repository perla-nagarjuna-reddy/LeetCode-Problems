class Solution {
    public int minimumRecolors(String blocks, int k) {
        int i = 0;
        int j = 0;

        int ans = Integer.MAX_VALUE;

        while(j < blocks.length()){

            if((j - i + 1) < k){
                j++;
            }

            else if ((j - i + 1) == k){

                int wCount = 0;
                for(int m = i; m <= j;m++){
                    if(blocks.charAt(m) == 'W'){
                        wCount++;
                    }
                }

                ans = Math.min(ans,wCount);
                i++;
                j++;
            }
        }

        return ans;
    }
}