class Solution {
    public String triangleType(int[] nums) {

        Arrays.sort(nums);
        
        int a = nums[0], b = nums[1], c = nums[2];      

        if (a + b > c && a + c > b && b + c > a){

            if(a == b && b == c) return "equilateral";

            else if(a == b || b == c || a == c) return "isosceles";

            else return "scalene";
        }

        return "none";
    }
}