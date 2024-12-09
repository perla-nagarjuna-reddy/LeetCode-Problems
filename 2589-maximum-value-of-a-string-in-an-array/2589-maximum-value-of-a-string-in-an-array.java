class Solution {
    public int maximumValue(String[] strs) {
        int ans = Integer.MIN_VALUE;

        for(int i=0; i < strs.length;i++){
            if(tryParse(strs[i]) != -1){
                ans = Math.max(ans,tryParse(strs[i]));
            }else{
                ans = Math.max(ans,strs[i].length());
            }
        }

        return ans;
    }

    public static int tryParse(String word){
        try{
            return Integer.parseInt(word);
        }
        catch(Exception e){
            return -1;
        }
    }
}