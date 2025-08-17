class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {

        int[] preTime = new int[travel.length + 1];

        for(int i = 1; i <= travel.length;i++){
            preTime[i] = preTime[i-1] + travel[i-1];
        }

        int totalTime = 0;

        totalTime+=calculateTimeForCollecting(garbage,preTime,'G');
        totalTime+=calculateTimeForCollecting(garbage,preTime,'M');
        totalTime+=calculateTimeForCollecting(garbage,preTime,'P');

        return totalTime;
    }

    public static int calculateTimeForCollecting(String[] garbage, int[] preTime, char type){

        int count = 0;

        int index = -1;

        for(int i = 0; i < garbage.length; i++){

            for(char ch : garbage[i].toCharArray()){

                if(ch == type){
                    count++;
                    index = i;
                }
            }
        }

        if(index == -1) return 0;

        return count + preTime[index];
    }
}