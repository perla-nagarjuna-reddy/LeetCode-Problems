class Solution {
    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        List<Integer> res =  new ArrayList<>();
        findCombinations(arr,0,arr.length,target,res,ans,set); 
        return ans;
    }

    public void findCombinations(int[] arr,int ind,int n,int target,List<Integer> res,List<List<Integer>> ans,Set<List<Integer>> set){
        if(ind == n){
            if(target == 0){
                // Collections.sort(res);
                if(!set.contains(res)){
                    ans.add(new ArrayList<>(res));
                }
                set.add(res);
            }

            return;
        }

        if(arr[ind] <= target){
            res.add(arr[ind]);
            findCombinations(arr,ind+1,n,target - arr[ind],res,ans,set);
            while(ind < n-1 && arr[ind] == arr[ind+1]) ind++;
            res.remove(res.size() - 1);
        }
        findCombinations(arr,ind+1,n,target,res,ans,set);
    }
}