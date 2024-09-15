class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            int j=i+1;
            int k = n-1;
            while(j< k){

                if(nums[i]+nums[j]+nums[k] == 0){
                    while(j < k && nums[j] == nums[j+1]) j++;
                    while(j < k && nums[k] == nums[k-1]) k--;
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    set.add(temp);
                    j++;
                    k--;
                }
                else if (nums[i]+nums[j]+nums[k] < 0) {
                    j++;
                }
                else{
                    k--;
                }
                
            }

        } 

        for(List<Integer> lst : set){
            ans.add(lst);
        }

        return ans;
    }
}