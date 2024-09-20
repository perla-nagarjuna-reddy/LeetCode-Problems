class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            int j=i+1;
            int k = n-1;
            while(j < k){
                int sum = nums[i]+nums[j]+nums[k];
                if(Math.abs(sum - target) < Math.abs(min - target)){
                    min = sum;
                     
                }
                if(sum < target){
                    j++;
                }
                else if(sum > target){
                    k--;
                }
                else{
                    return sum;
                }
                
            }
        }

        return min;
    }
}