class Solution {
    public int maxSum(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        List<Integer> lst = new ArrayList<>();
        int negative = 0;
        for(int num : nums){
            if(!set.contains(num)){
                set.add(num);
                lst.add(num);
                if(num < 0){
                    negative++;
                }
            }
        }

        Collections.sort(lst);

        if(negative == lst.size()){
            return lst.get(lst.size() - 1);
        }

        int j = 0;

        int sum = 0;
        
        // int ans = Integer.MIN_VALUE;

        while(j < lst.size()){
            lst.get(j);

            if (lst.get(j) > 0){
                sum = sum + lst.get(j);
            }

            j++;
        }
        
        return sum;
    }
}