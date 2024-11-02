class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] ans = new int[code.length];

        if(k > 0){
            for(int i=0;i<code.length;i++){
                int sum = 0;
                int j = i+1;
                int end = k;
                while(end -- > 0){
                    sum+=code[j % code.length];
                    j++;
                }

                ans[i] = sum;
            }

            return ans;
        }
        else if (k < 0){
            for (int i = 0; i < code.length; i++) {
                int sum = 0;
                int j = i - 1;
                int end = -k;
                
                while (end-- > 0) {
                    sum += code[(j + code.length) % code.length];
                    j--;
                }
                
                ans[i] = sum;
            }
            return ans;
        }

        return ans;
    }
}