class Solution {
    public int[] maxKDistinct(int[] nums, int k) {

        Arrays.sort(nums);

        int i = 0; 

        int j = nums.length - 1;

        int count = 0;

        ArrayList<Integer> lst = new ArrayList<>();

        while (j >= 0 && count < k) {
            
            lst.add(nums[j]);
            count++;

            int current = nums[j];
            while (j >= 0 && nums[j] == current) {
                j--;
            }
        }

        int[] ans = lst.stream().mapToInt(Integer::intValue).toArray();

        return ans;
    }
}