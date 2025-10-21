class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> res = new ArrayList<>();

        solve(nums,0, nums.length,ans, res);

        return ans;
    }

    public void solve(int[] nums, int start, int end, List<List<Integer>> ans, List<Integer> res){

        if(start == end){

            ans.add(new ArrayList<>(res));

            return;
        }

        for(int i = start; i < end; i++){

            swap(nums,i,start);
            res.add(nums[start]);
            solve(nums,start + 1, end, ans, res);
            res.remove(res.size() - 1);
            swap(nums,i,start);
        }
    }

    public void swap(int[] nums, int first, int second){

        int temp = nums[first];

        nums[first] = nums[second];
        nums[second] = temp;
    }
}