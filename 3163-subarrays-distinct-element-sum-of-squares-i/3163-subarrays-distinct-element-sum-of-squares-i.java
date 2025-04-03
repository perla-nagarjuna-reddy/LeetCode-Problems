class Solution {
    public int sumCounts(List<Integer> nums) {
        
        int ans  = 0;
        for (int i=0; i<nums.size(); i++) {
            Set<Integer> curSet = new HashSet<>();
            for (int j=i; j<nums.size(); j++) {
                curSet.add(nums.get(j));
                ans += curSet.size()*curSet.size();
            }
        }
        return ans;
    }
}