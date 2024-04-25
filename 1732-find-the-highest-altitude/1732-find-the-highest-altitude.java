class Solution {
    public int largestAltitude(int[] gain) {
        int[] ans = new int[gain.length+1];
        ans[0] = 0;
        
        for(int i=0;i<gain.length;i++){
            ans[i+1] = ans[i]+gain[i];
        }
        
        int max = Integer.MIN_VALUE;
        
        System.out.println(Arrays.toString(ans));
        for(int val : ans){
            max = Math.max(val,max);
        }
        
        return max;
    }
}