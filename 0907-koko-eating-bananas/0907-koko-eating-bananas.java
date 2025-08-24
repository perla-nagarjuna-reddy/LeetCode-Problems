class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int max = 0;

        for(int pile : piles){
            max = Math.max(pile,max);
        }

        int low = 1;
        int high = max;

        while(low <= high){

            int mid = low + (high - low) / 2;

            if(canEat(piles,mid,h)){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return low;
    }

    public boolean canEat(int[] arr, int k, int h){

        int noOfhours = 0;

        for(int i = 0; i < arr.length; i++){

            int hours = (int)Math.ceil((double)arr[i] / k);
            noOfhours+=hours;
            if(noOfhours > h){
                return false;
            }
        }

        return true;
    }
}