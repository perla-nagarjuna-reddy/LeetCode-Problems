class Solution {
    public int[] sortEvenOdd(int[] nums) {
        List<Integer> oddInd = new ArrayList<>();
        List<Integer> evenInd = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if( i % 2 == 0){
                evenInd.add(nums[i]);
            }
            else{
                oddInd.add(nums[i]);
            }
        }
        Collections.sort(oddInd);
        Collections.reverse(oddInd);
        Collections.sort(evenInd);
        int n = oddInd.size() + evenInd.size();
        int[] ans = new int[n];
        int ind = 0;
        int ind1 = 0;
        for(int i=0;i<n;i++){
            if(i % 2 == 1){
                ans[i] = oddInd.get(ind++);
            }
            else{
                ans[i] = evenInd.get(ind1++);
            }
        }

        return ans;
    }
}