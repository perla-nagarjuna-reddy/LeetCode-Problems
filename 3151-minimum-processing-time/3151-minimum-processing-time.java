class Solution {
    public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {

        int ans  = 0;

        Collections.sort(tasks);

        Collections.sort(processorTime);

        Collections.reverse(tasks);

        int pos = 0;

        int ind = 0;

        for(int i = 0 ; i < processorTime.size(); i++){

            for(int j = ind ; j < ind + 4; j++){
                ans = Math.max(processorTime.get(i)+tasks.get(j),ans);
                
            }
            ind += 4;
        }


        return ans;
    }
}