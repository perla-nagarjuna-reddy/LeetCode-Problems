class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        
        if(m*k > bloomDay.length) return -1;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int val : bloomDay){
            min = Math.min(val,min);
            max = Math.max(max,val);
        }

        int low = min;
        int high = max;

        int ans = -1;

        while(low <= high){

            int mid  = low + (high - low) / 2;

            if(canMake(bloomDay,mid,m,k)){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return ans;
    }

    public boolean canMake(int[] arr, int day, int m, int k){


        int cnt = 0;

        int kCnt = 0;

        int bCnt = 0;

        for(int i = 0; i < arr.length; i++){

            
            if(arr[i] <= day){
                kCnt++;
            }
            else{
                kCnt = 0;
            }
            if(kCnt >= k){
                bCnt++;
                kCnt = 0;
            }
        }

        return bCnt >= m;
    }
}