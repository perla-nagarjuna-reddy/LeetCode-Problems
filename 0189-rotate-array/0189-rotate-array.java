class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length-1;
        k = k % nums.length;
        reverseArray(nums,0,n-k);
        reverseArray(nums,n-k+1,n);
        reverseArray(nums,0,n);
    }

    public void reverseArray(int[] nums,int start,int n){
        for(int i=start;i<n;i++){
            int temp = nums[i];
            nums[i] = nums[n];
            nums[n] = temp;
            n--;
        }
    }
}