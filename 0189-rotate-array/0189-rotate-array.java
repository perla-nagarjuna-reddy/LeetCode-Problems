class Solution {
    public void rotate(int[] nums, int k) {

        k =  k % nums.length;

        if(k == 0) return;

        int n = nums.length;

        int[] arr = new int[n-k];

        for(int i = 0; i < n - k; i++){
            arr[i] = nums[i];
        }

        int[] rotate = new int[k];
        int ind = 0;

        for(int i = n - k; i < nums.length; i++){
            rotate[ind++] = nums[i];
        }

        ind = 0;

        for(int i = 0 ; i < nums.length; i++){

            if(i < k){
                nums[i] = rotate[i];
            }
            else{
                nums[i] = arr[ind++];
            }
        }

    }
}