class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        int count = 0 ;
        int n = batteryPercentages.length;
        for(int i=0; i < n; i++){
            if(batteryPercentages[i] == 0){
                continue;
            }
            else if(batteryPercentages[i] > 0){
                count++;
                for(int j=i+1; j < n; j++){
                    batteryPercentages[j] = batteryPercentages[j] - 1;
                }
            }
        }

        return count;

    }
}