class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int[] binary_arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            binary_arr[i] = (nums[i] % 2 == 0)?0:1;
        }
        System.out.println(Arrays.toString(binary_arr));
        return countSub(binary_arr,k) - countSub(binary_arr,k-1);
    }
    public int countSub(int[] nums,int k){
        if(k < 0) return 0;
        int l = 0;
        int r = 0;
        int count = 0;
        int sum = 0;
        while(r < nums.length){
            sum+=nums[r];
            while(sum > k){
                sum=sum-nums[l];
                l++;
            }
            count = count+(r-l+1);
            r++;
        }
        return count;
    }
}