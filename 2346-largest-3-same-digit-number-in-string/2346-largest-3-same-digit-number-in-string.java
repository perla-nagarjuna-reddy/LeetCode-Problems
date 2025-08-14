class Solution {
    public String largestGoodInteger(String num) {

        int start = 0;

        int end = 0;

        int lastNum = 0;

        String ans = "";

        while(end < num.length()){

            if((end - start + 1) < 3){
                end++;
                continue;
            }

            if((end - start + 1) == 3){

                StringBuilder sb = new StringBuilder();

                sb.append(num.substring(start,end+1));

                if(sb.charAt(0) != sb.charAt(1) || sb.charAt(1) != sb.charAt(2)){
                    start++;
                }
                else{
                    int nu = sb.charAt(0) - 48;
                    if(nu >= lastNum){
                        ans = sb.toString();
                        lastNum = nu;
                    }
                    start = end;
                }
                end++;
            }

        }

        return ans;
    }
}