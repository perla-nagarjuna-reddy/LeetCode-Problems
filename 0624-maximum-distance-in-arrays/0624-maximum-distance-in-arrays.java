class Solution {
    public int maxDistance(List<List<Integer>> arrays) {

        int ans = Integer.MIN_VALUE;
        
        int mini = arrays.get(0).get(0);       

        int ele = arrays.get(0).get(arrays.get(0).size() - 1);

        for(int i = 1 ; i < arrays.size(); i++){

            int min = arrays.get(i).get(0);
            int max = arrays.get(i).get(arrays.get(i).size() - 1);

            int diff1 = Math.abs(max - mini);
            
            int diff2 = Math.abs(ele - min);

            ans = Math.max(ans, Math.max(diff1, diff2));

            ele = Math.max(ele, max);

            mini = Math.min(mini, min);

        }

        return ans;
    }
}