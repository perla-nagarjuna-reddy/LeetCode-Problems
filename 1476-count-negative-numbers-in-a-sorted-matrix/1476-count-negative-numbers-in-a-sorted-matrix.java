class Solution {
    public int countNegatives(int[][] grid) {

        int count = 0;

        

        for(int[] arr : grid){

            int getLow = getLowerBoundary(arr);

            int n = arr.length;

            if (getLow == -1) {
                count += n;
            } 
            else {
                count += n - getLow - 1;
            }

        }

        return count;
    }


    public int getLowerBoundary(int[] arr){

        int low = 0; 
        int high = arr.length - 1;

        int ans = -1;

        while(low <= high){

            int mid = low + (high - low) / 2;

            if(arr[mid] >= 0){
                ans = mid;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        return ans;
    }


}