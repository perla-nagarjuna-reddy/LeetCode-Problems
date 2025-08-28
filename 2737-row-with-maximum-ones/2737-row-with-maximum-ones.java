class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {

        int maxCnt = -1;

        int ind =0;

        for(int i= 0 ; i < mat.length; i++){

            Arrays.sort(mat[i]);

            int firstOneIndex = lowerBound(mat[i]); 

            int cnt = mat[i].length - firstOneIndex;

            if (cnt > maxCnt) {
                ind = i;
                maxCnt = cnt;
            }    

        }
        return new int[]{ind,maxCnt};
    }

    public static int lowerBound(int[] arr){

        int ans = arr.length;

        int low = 0;

        int high = arr.length - 1;

        while(low <= high){

            int mid = low + (high - low) / 2;

            if(arr[mid] >= 1){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return ans;
    }
}