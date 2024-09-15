class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int ele = Integer.MIN_VALUE;
        int ele1 = Integer.MIN_VALUE;
        int count = 0;
        int count1 = 0;
        for(int i=0;i<nums.length;i++){
            if(count == 0 && ele1 != nums[i]){
                count = 1;
                ele = nums[i];
            }
            else if(count1 == 0 && ele != nums[i]){
                count1 = 1;
                ele1 = nums[i];
            }
            else if(ele == nums[i]){
                count++;
            }
            else if(ele1 == nums[i]){
                count1++;
            }
            else{
                count--;
                count1--;
            }
        }

        int cnt1 = 0;
        int cnt2 = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] == ele){
                cnt1++;
            }
            if(nums[i] == ele1){
                cnt2++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        int mini = (int)(nums.length / 3)+1;
        if(cnt1 >= mini) ans.add(ele);
        if(cnt2 >= mini) ans.add(ele1);
        return ans;
    }
    
}