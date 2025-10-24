class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> res = new ArrayList<>();

        solve(candidates,0,0,target,ans,res);

        return ans;
    }

    public void solve(int[] candidates,int sum,int ind, int target,List<List<Integer>> ans, List<Integer> res){

        if(sum == target){
            ans.add(new ArrayList<>(res));
            return;
        }

        if (sum > target || ind >= candidates.length) {
            return;
        }

        res.add(candidates[ind]);
        solve(candidates,sum + candidates[ind],ind,target,ans,res);
        res.remove(res.size() - 1);
        solve(candidates,sum,ind + 1,target,ans,res);
    }
}