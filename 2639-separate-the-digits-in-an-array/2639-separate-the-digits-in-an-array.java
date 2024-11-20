class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            List<Integer> lst = findDigits(nums[i]);
            for(int val : lst){
                ans.add(val);
            }
        }
        int[] res = new int[ans.size()];

        for(int i=0;i<ans.size();i++){
            res[i] = ans.get(i);
        }

        return res;
    }

    public List<Integer> findDigits(int num){
        
        List<Integer> temp = new ArrayList<>();

        while(num > 0){
            temp.add(0,num % 10);
            num = num / 10;
        }

        return temp;
    }
}