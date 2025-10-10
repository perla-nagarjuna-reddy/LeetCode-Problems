class Solution {
    public int maximumEnergy(int[] energy, int k) {


        int res = Integer.MIN_VALUE;

        for(int i = 0; i < k; i++){

            int preSum = energy[i];

            for(int j = i+k; j < energy.length;j=j+k){

                if(preSum < 0){

                    preSum = energy[j];
                    
                }

                else{
                    preSum += energy[j];
                }
            }

            res = Math.max(res,preSum);
        }

        return res;
    }
}