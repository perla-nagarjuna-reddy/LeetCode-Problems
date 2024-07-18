class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = -1;
        for(int i : piles){
            max = Math.max(i,max);
        }

        int low = 1;
        int high = max;

        while(low<=high){
            int mid = (low+high) / 2;

            int totalHours = findingMin(piles,mid);

            if(totalHours <= h){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }

        return low;
    }

    public int findingMin(int[] piles,int hourly){
        int total = 0;

        for(int val : piles){
            total+=Math.ceil((double)val / (double)hourly);
        }
        return total;
    }
}