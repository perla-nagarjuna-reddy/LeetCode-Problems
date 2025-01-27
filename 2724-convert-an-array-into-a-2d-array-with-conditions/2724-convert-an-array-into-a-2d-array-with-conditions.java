class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        int count = 0;

        while(count  < nums.length){
            ArrayList<Integer> list=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=0 && !list.contains(nums[i])){
                    list.add(nums[i]);
                    nums[i]=0;
                    count++;
                }
            }

            ans.add(list);
        }

        return ans;
    }
}