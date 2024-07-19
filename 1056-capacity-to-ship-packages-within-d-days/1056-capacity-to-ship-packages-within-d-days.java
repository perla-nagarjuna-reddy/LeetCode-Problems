class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int maxCapacity = 0;
        int max = 0;
        for(int val : weights){
            maxCapacity+=val;
            max = Math.max(val,max);
        }

        int low = max;
        int high = maxCapacity;

        while(low <= high){
            int mid = low+(high-low)/2;
            int totalDays = findingTotalDays(weights,mid);
            // System.out.println(mid+" "+totalDays);
            if(totalDays <= days){
                high = mid-1;
                System.out.println("After one operation");
            }
            else{
                low = mid+1;
                System.out.println("After one operation");
            }
        }

        return low;
    }

    public int findingTotalDays(int[] weights,int cap){
        long sum = 0;
        int noOfdays = 1;
        System.out.println(cap);
        for(int i=0;i<weights.length;i++){
            sum+=weights[i];
            if(sum > cap){
                noOfdays++;
                sum = weights[i];
            }
        }

        return noOfdays;
    }
}