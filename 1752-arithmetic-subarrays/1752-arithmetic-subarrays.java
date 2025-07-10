class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        
        List<Boolean> ans = new ArrayList<>();


        for(int i = 0; i < l.length; i++){

            int startInd = l[i];

            int endInd = r[i];

            List<Integer> lst = new ArrayList<>();

            for(int j = startInd; j <= endInd; j++){
                lst.add(nums[j]);
            }
            Collections.sort(lst);

            int diff = lst.get(1) - lst.get(0);

            boolean isArithmetic = true;

            for(int k = 1; k < lst.size() - 1; k++){
                int diffOne = Math.abs(lst.get(k) - lst.get(k+1));

                if(diff != diffOne){
                    isArithmetic = false;
                    break;
                }
            }

            if(isArithmetic){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }

        return ans;
    }
}