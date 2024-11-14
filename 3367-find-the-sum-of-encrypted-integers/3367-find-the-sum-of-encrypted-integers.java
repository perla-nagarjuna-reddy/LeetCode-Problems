class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i=0;i<n;i++){
            int bigNum = digit(nums[i]);
            StringBuilder sb = new StringBuilder();

            for(int j=0;j<String.valueOf(nums[i]).length();j++){
                sb.append(String.valueOf(bigNum));
            }

            String str = sb.toString();
            int num = Integer.parseInt(str);
            sum = sum + num;
        }

        return sum;
    }

    public int digit(int num){
        int max = Integer.MIN_VALUE;

        while(num > 0){
            int digit = num % 10;
            max = Math.max(digit,max);
            num = num / 10;
        }

        return max;
    }
}