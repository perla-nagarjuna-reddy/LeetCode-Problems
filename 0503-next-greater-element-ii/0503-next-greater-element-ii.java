class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[nums.length];
        for(int i=2*nums.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek() <= nums[i % nums.length]){
                st.pop();
            }
            if(i < nums.length){
                 if(st.isEmpty()){
                    ans[i] = -1;
                }
                else{
                    ans[i] = st.peek();
                }
            }
            st.push(nums[i % nums.length]);
        }

        return ans;
    }
}