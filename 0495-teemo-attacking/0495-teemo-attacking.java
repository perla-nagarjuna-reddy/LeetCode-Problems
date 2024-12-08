class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if(duration == 0){
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        int totalDuration = 0;
        for(int i=0;i < timeSeries.length - 1; i++){
            totalDuration += Math.min(duration, timeSeries[i + 1] - timeSeries[i]);
        }
        totalDuration+=duration;
        return totalDuration;
    }
}