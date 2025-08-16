class Solution {
    public int missingNumber(int[] nums) {
        
        int n = nums.length;

        int ans[] = new int[n+1];

        for(int num : nums){
            ans[num]++;
        }

        for(int i = 0; i < ans.length; i++){
            if(ans[i] == 0) return i;
        }

        return -1;
    }
}