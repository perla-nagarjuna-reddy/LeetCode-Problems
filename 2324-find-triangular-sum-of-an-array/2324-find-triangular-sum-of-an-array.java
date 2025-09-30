class Solution {
    public int triangularSum(int[] nums) {
        List<Integer> lst = new ArrayList<>();

        for(int num : nums){
            lst.add(num);
        }

        while(lst.size() != 1){
            
            List<Integer> temp  = new ArrayList<>();

            for(int i = 0 ; i < lst.size() - 1; i++){
                int sum = lst.get(i) + lst.get(i+1);

                if(sum > 9){
                    sum = sum % 10;
                }
                temp.add(sum);
            }

            lst = temp;
        }

        return lst.get(0);
    }
}