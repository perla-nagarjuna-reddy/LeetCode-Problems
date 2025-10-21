class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> res =  new ArrayList<>(); 

        solve(nums,0,ans,res);

        return ans;
    }

    public void solve(int[] nums, int ind,List<List<Integer>> ans, List<Integer> res){

        if(ind == nums.length){
            ans.add(new ArrayList<>(res));
            return;
        }

        res.add(nums[ind]);

        solve(nums,ind+1,ans, res);

        res.remove(res.size() - 1);

        solve(nums, ind + 1, ans, res);
    }
}