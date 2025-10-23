class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> res =  new ArrayList<>(); 

        solve(nums,0,ans,res);

        return ans;
    }

    public void solve(int[] nums, int ind,List<List<Integer>> ans, List<Integer> res){

        ArrayList<Integer> curr  = new ArrayList<>(res);

        ans.add(curr);

        for(int i = ind; i < nums.length; i++){
            res.add(nums[i]);
            solve(nums,i+1,ans,res);
            res.remove(res.size() - 1);
        }
    }
}