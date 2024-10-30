class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        
        for(int val = left;val <= right;val++){
            boolean isValid = false;
            for(int[] arr : ranges){
                int start = arr[0];
                int end = arr[1];

                if(start <= val && val <= end){
                    isValid = true;
                    break;
                }
            }

            if(!isValid){
                return  false;
            }
        }


        return true;

    }
}