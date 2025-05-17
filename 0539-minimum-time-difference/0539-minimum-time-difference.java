class Solution {
    public int findMinDifference(List<String> timePoints) {

        int n = timePoints.size();

        int[] minArray = new int[n];

        for(int i=0; i < n; i++){

            String[] parts = timePoints.get(i).trim().split(":");
            int hours = Integer.parseInt(parts[0].trim());
            int minutes = Integer.parseInt(parts[1].trim());
            minArray[i] = hours * 60 + minutes;
        }

        Arrays.sort(minArray);

        int ans = Integer.MAX_VALUE;

        for(int i = 1 ; i < n; i++){
            ans = Math.min(ans, minArray[i] - minArray[i-1]);
        }


        return Math.min(ans,Math.abs(minArray[0] + 1440 - minArray[n-1]));
    }
}