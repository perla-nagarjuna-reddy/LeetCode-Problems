class Solution {
    public int maxArea(int[] height) {

        int ans = Integer.MIN_VALUE;

        int left = 0; 

        int right = height.length - 1;

        while(left  < right){

            int dist = right - left ;

            int h = Math.min(height[left],height[right]);

            ans = Math.max(ans, dist * h);

            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }

        return ans;
    }
}