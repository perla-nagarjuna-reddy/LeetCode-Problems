class Solution {
    public String toHex(int num1) {
        if(num1 == 0) return "0";
        long num = num1;
        if(num < 0){
            num = (long)Math.pow(2,32)+num;
        }
        char[] arr = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        StringBuilder sb = new StringBuilder();

        while(num > 0){
            sb.append(arr[(int)Math.abs(num % 16)]);
            num = num / 16;
        }

        return sb.reverse().toString();
    }
}