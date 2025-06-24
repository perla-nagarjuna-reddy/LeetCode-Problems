class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        Set<Integer> ans = new HashSet<>();

        List<Integer> res = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){

            for(int j = 0; j < nums.length; j++){

                if(Math.abs(i-j) <= k && nums[i] == key){
                    ans.add(j);
                }
            }
        }

        for(int val : ans){
            res.add(val);
        }

        Collections.sort(res);

        return res;
    }
}