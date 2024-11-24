class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        Set< Double > s = new HashSet<>();

        int i = 0, j = nums.length - 1;

        while(i < j){
            double temp = (nums[i] + nums[j]) / 2.0;
            s.add(temp);
            i++;
            j--;
        }
        return s.size();
    }
}