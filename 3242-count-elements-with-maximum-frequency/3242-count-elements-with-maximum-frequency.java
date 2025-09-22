class Solution {
    public int maxFrequencyElements(int[] nums) {
        
        int[] ans = new int[101];

        int max = Integer.MIN_VALUE;

        for(int num : nums){

            max = Math.max(max,ans[num]++);
        }
        int sum = 0;

        for(int val : ans){

            if(val > max){
                sum+=val;
            }
        }

        return sum;
    }
}