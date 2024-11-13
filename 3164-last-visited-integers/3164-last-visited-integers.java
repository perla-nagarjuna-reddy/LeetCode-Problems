class Solution {
    public List<Integer> lastVisitedIntegers(int[] nums) {
        ArrayList<Integer> seen = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        int k = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > 0){
                seen.add(0,nums[i]);
                k = 0;
            }
            else if(nums[i] < 0){
                k++;
                if(k <= seen.size()){
                    ans.add(seen.get(k-1));
                }
                else if (k > seen.size()){
                    ans.add(-1);
                }
            }
        }

        return ans;
    }
}