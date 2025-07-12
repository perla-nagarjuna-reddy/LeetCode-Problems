class Solution {
    public List<Integer> findLonely(int[] nums) {

        List<Integer> ans = new ArrayList<>();
        
        int[] freq = new int[1000002];

        for(int val : nums){
            freq[val]++;
        }

        for(int val : nums){

            if(val == 0 && freq[val] == 1 && freq[val+1] == 0){
                ans.add(val);
                continue;
            }
            
            if(val != 0 && freq[val] == 1 && freq[val - 1] == 0 && freq[val+1] == 0){
                ans.add(val);
            }
        }

        return ans;
    }
}