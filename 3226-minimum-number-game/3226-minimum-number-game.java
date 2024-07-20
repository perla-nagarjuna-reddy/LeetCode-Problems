class Solution {
    public int[] numberGame(int[] nums) {
        ArrayList<Integer> alice = new ArrayList<>();
        ArrayList<Integer> bob = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i % 2 == 0){
                alice.add(nums[i]);
            }
            else{
                bob.add(nums[i]);
            }
        }
        int k = 0;
        int m = 0;
        for(int i=0;i<nums.length;i++){
            if(i % 2 == 0){
                nums[i] = bob.get(m++);
            }
            else{
                nums[i] = alice.get(k++);
            }
        }

        return nums;
    }
}