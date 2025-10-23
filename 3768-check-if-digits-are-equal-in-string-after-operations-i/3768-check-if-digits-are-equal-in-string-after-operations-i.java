class Solution {
    public boolean hasSameDigits(String s) {

        StringBuilder sb = new StringBuilder(s);

        while(sb.length() != 2){
            StringBuilder sb1 = new StringBuilder();
            for(int i = 1 ; i < sb.length(); i++){

                int num = (sb.charAt(i-1) - 48 + sb.charAt(i)-48) % 10;
                sb1.append(num);
            }
            sb.setLength(0);
            sb.append(sb1);
        }

        return sb.charAt(0) == sb.charAt(1) ? true : false;
    }
}