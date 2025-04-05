class Solution {
    int ans = 0;
    public int subsetXORSum(int[] nums) {

        List<Integer> res = new ArrayList<>();

        int n = nums.length;

        solve(0,n,res,nums);
        return ans;
    }


    void solve(int ind, int end,List<Integer> res,int[] nums){
        
        if(res.size() != 0){
            int xor = 0;
            for(int k = 0 ; k < res.size();k++){
                xor = xor ^ res.get(k);
            }
            ans = ans + xor;
        }

        for (int i = ind; i < nums.length; i++) {
            res.add(nums[i]);
            solve(i + 1, end, res, nums);
            res.remove(res.size() - 1);
        }

    }
}