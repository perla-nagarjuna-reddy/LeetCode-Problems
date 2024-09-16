class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                Set<Long> st = new HashSet<>();
                for(int k=j+1;k<n;k++){
                    long pend = (long)target - ((long)nums[i] + (long)nums[j] + (long)nums[k]);
                    if(st.contains(pend)){
                        List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k],(int)pend);
                        Collections.sort(temp);
                        set.add(temp);
                    }
                    st.add((long)nums[k]);
                }
            }
        }
        for(List<Integer> list : set){
            ans.add(list);
        }

        return ans;
    }
}