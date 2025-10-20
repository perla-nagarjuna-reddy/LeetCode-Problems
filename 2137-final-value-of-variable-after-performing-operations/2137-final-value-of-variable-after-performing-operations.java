class Solution {
    public int finalValueAfterOperations(String[] operations) {
        
        int ans = 0;

        for(String arr : operations){

            if(arr.equals("X++") || arr.equals("++X")){
                ans+=1;
            }
            else{
                ans-=1;
            }
        }

        return ans;
    }
}