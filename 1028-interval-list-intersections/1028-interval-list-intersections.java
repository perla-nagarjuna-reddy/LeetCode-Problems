class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {

        List<int[]> lst = new ArrayList<>();

        int i = 0; 

        int j = 0;


        while(i < firstList.length && j < secondList.length){

            int intervalStart = firstList[i][0];

            int intervalEnd = firstList[i][1];

            int intervalStart1 = secondList[j][0];

            int intervalEnd1 = secondList[j][1];

            int maxStart = Math.max(intervalStart,intervalStart1);

            int minEnd = Math.min(intervalEnd,intervalEnd1);


            if(maxStart <= minEnd){
                lst.add(new int[]{maxStart,minEnd});
            }

            if(intervalEnd < intervalEnd1){
                i++;
            }
            else{
                j++;
            }
        }

        int[][] ans = new int[lst.size()][2];

        for(i = 0; i < lst.size(); i++){
            ans[i] = lst.get(i);
        }

        return ans;
    }
}