class Solution {
    public String maximumOddBinaryNumber(String s) {

        int oneCount = -1;

        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < s.length(); i++){

            if(s.charAt(i) == '0'){
                sb.append(0);
            }
            else{
                oneCount++;
            }
        }

        sb.append(1);

        while(oneCount > 0){

            sb.insert(0,1);
            oneCount--;
        }

        return sb.toString();
    }
}