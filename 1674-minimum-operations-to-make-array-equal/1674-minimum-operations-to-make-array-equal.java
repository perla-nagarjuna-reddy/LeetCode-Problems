class Solution {
    public int minOperations(int n) {
        
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = (2*i) + 1;
        }


        int median = arr[n / 2];

        int ops = 0;

        for(int i = 0; i < n; i++){

            ops+=Math.abs(median - arr[i]) / 2;
            
        }

        return ops;

    }
}