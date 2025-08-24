class Solution {
    public long repairCars(int[] ranks, int cars) {
        
        long low = 1;

        int totalTime = 0;

        int n = ranks.length;

        long max = 0;

        for(int rank : ranks){
            max = Math.max(rank,max);
        }

        long high = max * (long)cars * cars;

        long ans = -1;

        while(low <= high){

            long mid = low + (high - low) / 2;

            if(canRepair(ranks,mid,cars)){

                ans = mid;

                high = mid -1;
            }
            else{
                low = mid + 1;
            }
        }

        return  ans;
    }
    public boolean canRepair(int[] ranks, long time,int cars){

        long noOfcars = 0;

        for(int i = 0; i < ranks.length; i++){

            noOfcars += (long)Math.sqrt(time / ranks[i]);
        }

        return noOfcars >= cars;

    }
}