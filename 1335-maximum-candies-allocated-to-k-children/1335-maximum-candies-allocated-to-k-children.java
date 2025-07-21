class Solution {
    public int maximumCandies(int[] candies, long k) {

        long totalSum = 0;

        for(int val :  candies){
            totalSum+=val;
        }

        long low = 1;

        long high = totalSum;

        int ans = 0;

        while(low <= high){

            long mid = low + (high  - low) / 2;

            if(canAllotCandies(candies,mid,k)){
                ans = (int) mid;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        return ans;
    }

    public boolean canAllotCandies(int[] candies, long maxCandies, long childs){

        long noOfCandies = 0;

        for(int val : candies){

            noOfCandies += val / maxCandies;
        }

        return noOfCandies >= childs;
    }
}