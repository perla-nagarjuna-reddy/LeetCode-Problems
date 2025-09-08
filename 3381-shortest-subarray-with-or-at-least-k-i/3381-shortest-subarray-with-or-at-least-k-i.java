class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {

        if(k == 0) return 1;

        int start = 0;

        int end = 0;

        int xor = 0;

        int ans = Integer.MAX_VALUE;

        while(end < nums.length){

            xor = xor | nums[end];

            if(xor < k){
                end++;
                continue;
            }

            else if (xor >= k){

                while(xor >= k && start <= end){

                    ans = Math.min(ans,end-start + 1);
                    int temp = 0;

                    for(int i = start + 1; i <= end; i++){
                        temp = temp | nums[i];
                    }

                    xor = temp;

                    start++;
                }

                end++;
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}