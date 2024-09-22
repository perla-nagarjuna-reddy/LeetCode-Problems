class Solution {
    public List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> res =  new ArrayList<>();
        findCombinations(arr,0,arr.length,target,res,ans); 
        return ans;
    }

    public void findCombinations(int[] arr,int ind,int n,int target,List<Integer> res,List<List<Integer>> ans){
        if(ind == n){
            if(target == 0){
                ans.add(new ArrayList<>(res));
            }
            return;
        }

        if(arr[ind] <= target){
            res.add(arr[ind]);
            findCombinations(arr,ind,n,target - arr[ind],res,ans);
            res.remove(res.size() - 1);
        }
        findCombinations(arr,ind+1,n,target,res,ans);
    }

}
