class Solution {
    public void rotate(int[] nums, int k) {

        k = k % nums.length;

        int n = nums.length;

        int first = n - k;

        int[] arr1 = new int[first];


        for(int i = 0 ; i < first; i++){
            arr1[i] = nums[i];
        }

        int[] arr2 = new int[n - first];

        int j = 0;

        for(int i = first; i < n; i++){
            arr2[j++] = nums[i];
        }

        for(int i = 0 ; i < arr2.length; i++){

            nums[i] = arr2[i];
        }

        j = 0;

        for(int i = arr2.length ; i < nums.length; i++){

            nums[i] = arr1[j++];
        }


    }
}