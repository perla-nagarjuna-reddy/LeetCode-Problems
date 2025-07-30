/*
 * // This is the custom function interface.
 * // You should not implement it, or speculate about its implementation
 * class CustomFunction {
 *     // Returns f(x, y) for any given positive integers x and y.
 *     // Note that f(x, y) is increasing with respect to both x and y.
 *     // i.e. f(x, y) < f(x + 1, y), f(x, y) < f(x, y + 1)
 *     public int f(int x, int y);
 * };
 */

class Solution {
    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
        
        List<List<Integer>> ans = new ArrayList<>();
        

        int low = 1;

        int high  = 1000;

        while(low <= 1000 && high >= 1){

            if(customfunction.f(low,high) == z){
                ans.add(Arrays.asList(low, high));
                low++;
                high--;
            }
            else if(customfunction.f(low,high) > z){
                high = high - 1;
            }
            else{
                low = low + 1;
            }
        }

        return ans;
    }
}