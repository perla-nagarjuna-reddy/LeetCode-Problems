class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> small = new ArrayList<>();

        List<Integer> large = new ArrayList<>();

        for(int i = 0 ; i  < nums.length; i++){

            if(nums[i] < pivot){
                small.add(nums[i]);
            }else{
                if(nums[i] == pivot){
                    large.add(0,nums[i]);
                    continue;
                }
                large.add(nums[i]);
            }
        }

        int n = nums.length;

        int[] ans = new int[n];

        int k = 0;
        for(int val : small){
            ans[k++] = val;
        }

        for(int val : large){
            ans[k++] = val;
        }

        return ans;
    }
}