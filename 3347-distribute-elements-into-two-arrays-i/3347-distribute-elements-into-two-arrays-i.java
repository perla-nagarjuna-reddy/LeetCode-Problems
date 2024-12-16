class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> lst1 = new ArrayList<>();
        List<Integer> lst2 = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(!lst1.isEmpty() && !lst2.isEmpty()){
                if(lst1.get(lst1.size()-1) > lst2.get(lst2.size() - 1)){
                    lst1.add(nums[i]);
                }
                else{
                    lst2.add(nums[i]);
                }
            }
            else if(i % 2 == 0){
                lst1.add(nums[i]);
            }
            else{
                lst2.add(nums[i]);
            }
        }
        int n = lst1.size()+lst2.size();
        int[] ans = new int[n];
        int k=0;
        for(int val : lst1){
            ans[k++] = val;
        }
        for(int val : lst2){
            ans[k++] = val;
        }
        return ans;
    }
}