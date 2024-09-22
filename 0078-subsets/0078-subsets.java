class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        int n = nums.length;
        findAllSubsets(nums,0,n,res,ans);
        return ans;
    }

    public void findAllSubsets(int[] nums,int ind,int n,List<Integer>res,List<List<Integer>> ans){
        if(ind >= n){
            ans.add(new ArrayList<>(res));
            return;
        }
        res.add(nums[ind]);
        findAllSubsets(nums,ind+1,n,res,ans);
        res.remove(res.size()-1);
        findAllSubsets(nums,ind+1,n,res,ans);
    }
}