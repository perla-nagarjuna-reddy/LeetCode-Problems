class Solution {
    public int minOperations(String s) {
        
        int ans = 0;
        
        for (char ch : s.toCharArray()) {

            if(ch != 'a'){

                int total = ('z' - ch) + 1;

                ans = Math.max(ans,total);
            }
            
        }
        
        return ans;
    }
}