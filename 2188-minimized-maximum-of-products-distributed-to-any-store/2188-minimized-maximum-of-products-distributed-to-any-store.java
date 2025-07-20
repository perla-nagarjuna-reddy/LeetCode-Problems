class Solution {
    public int minimizedMaximum(int n, int[] quantities) {

        int max = 0;

        for(int val : quantities){
            max = Math.max(val,max);
        }

        int low = 1;

        int high = max;

        int ans = 0;

        while(low <= high){

            int mid = low + (high - low) / 2;

            if(canPlaceProducts(quantities,mid,n)){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }

        return ans;

    }

    public boolean canPlaceProducts(int[] arr, int maxDist,int n){

        int noOfStore=0;
        for(int num:arr){
            noOfStore+=(num/maxDist);
            noOfStore+=num%maxDist!=0?1:0;
        }
        return n >=noOfStore;
    }
}