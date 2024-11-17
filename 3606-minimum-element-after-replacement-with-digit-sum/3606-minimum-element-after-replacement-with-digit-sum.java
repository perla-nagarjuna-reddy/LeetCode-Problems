class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++){
            int digitSum = calculate(nums[i]);
            min = Math.min(digitSum,min);
        }
        return min;
    }

    public int calculate(int num){
        int ans = 0;

        while(num > 0){
            int digit = num % 10;
            ans+=digit;
            num = num / 10;
        }

        return ans;
    }
}