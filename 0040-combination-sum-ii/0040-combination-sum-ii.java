class Solution {
    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> res =  new ArrayList<>();
        findCombinations(arr,0,target,res,ans); 
        return ans;
    }

    public void findCombinations(int[] arr,int ind,int target,List<Integer> res,List<List<Integer>> ans){
            if(target == 0){
                ans.add(new ArrayList<>(res));
                return;
            }

            for(int i=ind;i<arr.length;i++){
                if(i > ind && arr[i] == arr[i-1]) continue;
                if(arr[i] > target) break;
                res.add(arr[i]);
                findCombinations(arr,i+1,target - arr[i],res,ans);
                res.remove(res.size() - 1);
            }
    }
}