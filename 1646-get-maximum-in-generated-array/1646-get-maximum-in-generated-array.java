class Solution {
    public int getMaximumGenerated(int n) {
        int val = n/2;
        System.out.println(val);
        if(n == 0 ){
            return 0;
        }
        if(n <=2){
            return 1;
        }
        int [] ans = new int[n+1];
        ans[0] = 0;
        ans[1] = 1;
        if(n % 2 == 1){
            for(int i=1;i<=val;i++){
                ans[2*i] = ans[i];
                ans[(2*i)+1] = ans[i]+ans[i+1];
            }
        }
        else{
            for(int i=1;i<=val;i++){
                ans[2*i] = ans[i];
                if((2*i)+1 == ans.length){
                    break;
                }
                else{
                    ans[(2*i)+1] = ans[i]+ans[i+1];
                }
            }
        }
        int max_num = Integer.MIN_VALUE;
        
        for(int value : ans){
            max_num = Math.max(max_num,value);
        }
        return max_num;
    }
}