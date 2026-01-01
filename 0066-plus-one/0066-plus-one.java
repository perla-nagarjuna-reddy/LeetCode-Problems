class Solution {
    public int[] plusOne(int[] nums) {
        
        ArrayList<Integer> lst = new ArrayList<>();

        int n = nums.length;

        int carry = 0;

        for(int i = n - 1; i >=0; i--){

            int num = nums[i];

            if(i == n - 1){
                num = num + 1;
            }
            else{

                if(carry != 0){
                    num = num + carry;
                }
            }

            carry = num / 10;

            lst.add(num % 10);
        }
        
        if(carry != 0){
            lst.add(carry);
        }

        int[] ans = new int[lst.size()];
        
        int k = 0;

        for(int i = lst.size() - 1; i >= 0; i--){
            ans[k++] = lst.get(i);
        }

        return ans;
    }
}