class Solution {
    public long minimumTime(int[] time, int totalTrips) {


        if(time.length == 1){
            return (long)totalTrips * time[0];
        }
        
        long sum = 0;

        for(int val : time){
            sum += val;
        }

        long low = 1;

        long high = sum * totalTrips;

        long ans = -1;

        while(low <= high){

            long mid = low + (high - low) / 2;

            if(canPossibleToCompleteTrips(time,mid,totalTrips)){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return ans;
    }

    public boolean canPossibleToCompleteTrips(int[] time, long timeTake,int totalTrips){

        long count = 0;


        for(int i = 0; i < time.length; i++){

            count += timeTake / time[i];
        }

        return count >= totalTrips;
    }
}