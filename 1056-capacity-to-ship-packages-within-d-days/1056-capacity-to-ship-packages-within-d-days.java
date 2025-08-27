class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int sum = 0;

        int max = 0;

        for (int weight : weights){
            sum += weight;
            max = Math.max(weight,max);
        }

        int low = max;

        int high = sum;

        while(low <= high){

            int mid = low + (high - low) / 2;

            if(canShip(weights,mid,days)){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return low;
    }

    public boolean canShip(int[] arr, int capacity,int days){

        int totalWeight = 0;

        int noOfDays = 1;

        for(int i = 0 ; i < arr.length; i++){

            totalWeight += arr[i];

            if(totalWeight > capacity){
                noOfDays++;
                totalWeight = arr[i];
            }
        }

        return noOfDays <= days;
    }
}