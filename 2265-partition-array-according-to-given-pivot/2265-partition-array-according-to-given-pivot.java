class Solution {
    public int[] pivotArray(int[] nums, int pivot) {

        int n =  nums.length;

        int[] ans = new int[n];

        int k = 0;

        for(int val : nums){
            if(val < pivot){
                ans[k++] = val;
            }
        }

        for(int val : nums){
            if(val == pivot){
                ans[k++] = val;
            }
        }

        for(int val : nums){
            if(val > pivot){
                ans[k++] = val;
            }
        }

        return  ans;
    }
}