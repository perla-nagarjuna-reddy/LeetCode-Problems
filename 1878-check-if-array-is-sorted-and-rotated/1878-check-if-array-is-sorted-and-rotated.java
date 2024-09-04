class Solution {
    public boolean check(int[] nums) {
        int [] B = new int[nums.length];
        int ind = 0;

        for(int i=1;i<nums.length;i++){
            if(nums[i] < nums[i-1]){
                ind = i;
            }
        }
        for(int i=0;i<nums.length;i++){
            B[i] = nums[i];
        }
        Arrays.sort(nums);
        // System.out.println(B[(i+ind) % nums.length]);
        for(int i=0;i<nums.length;i++){
            if(nums[i] != B[(i+ind) % nums.length]){
                return false;
            }
        }
        return true;
    }
}