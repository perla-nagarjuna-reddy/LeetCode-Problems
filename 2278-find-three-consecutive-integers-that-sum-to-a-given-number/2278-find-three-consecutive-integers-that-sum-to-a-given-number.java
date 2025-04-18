class Solution {
    public long[] sumOfThree(long num) {
        
        
        long ans = 0;

        long low = 1;

        long high = num;


        while(low <= high){

            long mid = (low + (high - low) / 2);


            if(3*mid == num){
                ans = mid;
                break;
            }
            else if(3*mid > num){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        if(num == 0){
            return new long[]{ans - 1,ans,ans+1};
        }

        if(ans == 0) return new long[]{};
        return new long[]{ans - 1,ans,ans+1};
    }
}