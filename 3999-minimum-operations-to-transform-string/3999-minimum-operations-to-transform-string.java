class Solution {
    public int minOperations(String s) {
        
        int minSteps = 0;
        
        for (char ch : s.toCharArray()) {

            int steps = (26 + ('a' - ch)) % 26;

            minSteps = Math.max(minSteps, steps);
        }
        
        return minSteps;
    }
}