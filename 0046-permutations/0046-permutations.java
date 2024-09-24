class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        boolean[] map = new boolean[nums.length];
        findPermutations(nums,map,res,ans);
        return ans;
    }

    public void findPermutations(int[] nums,boolean[] map,List<Integer> res,List<List<Integer>> ans){
        if(res.size() == nums.length){
            ans.add(new ArrayList<>(res));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(!map[i]){
                map[i] = true;
                res.add(nums[i]);
                findPermutations(nums,map,res,ans);
                res.remove(res.size()-1);
                map[i] = false;
            }
        }
    }

}