class Solution {
    public int countMaxOrSubsets(int[] nums) {
        TreeMap<Integer,Integer> map = new TreeMap<>();

        solve(nums,0,0,map);

        System.out.println(map);

        return map.get(map.lastKey());
    }

    public void solve(int[] nums, int index,int bitSum, TreeMap<Integer,Integer> map){

        if (index == nums.length) {
            map.put(bitSum, map.getOrDefault(bitSum, 0) + 1);
            return;
        }

        int sum = bitSum;
        solve(nums, index + 1, sum | nums[index], map);
        solve(nums, index + 1, sum,map);
    }
}