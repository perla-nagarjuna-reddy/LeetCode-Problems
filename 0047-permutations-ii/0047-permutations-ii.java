class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> res = new ArrayList<>();

        HashSet<List<Integer>> set = new HashSet<>();

        solve(nums,0,ans,res,set);

        for(List<Integer> a : set){
            ans.add(a);
        }

        return ans;
    }

    public void solve(int[] nums, int ind, List<List<Integer>> ans,List<Integer> res,HashSet<List<Integer>> set){

        if(ind == nums.length){

            set.add(new ArrayList<>(res));

            return ;
        }

        for(int i = ind; i < nums.length; i++){

            swap(nums, i, ind);
            res.add(nums[ind]);
            solve(nums, ind + 1, ans,res,set);
            res.remove(res.size() - 1);
            swap(nums, i, ind);
        }
    }

    public void swap(int[] nums, int start, int end){

        int temp = nums[start];

        nums[start] = nums[end];

        nums[end] = temp;

    }
}