class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        
        List<Boolean> ans = new ArrayList<>();


        for(int i = 0; i < l.length; i++){

            int startInd = l[i];

            int endInd = r[i];

            int[] arr = new int[endInd - startInd + 1];
            int m  = 0;
            for(int j = startInd; j <= endInd; j++){
                arr[m++] = nums[j];
            }
            Arrays.sort(arr);

            int diff = arr[1] - arr[0];

            boolean isArithmetic = true;

            for(int k = 1; k < arr.length - 1; k++){
                int diffOne = arr[k+1] - arr[k];

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