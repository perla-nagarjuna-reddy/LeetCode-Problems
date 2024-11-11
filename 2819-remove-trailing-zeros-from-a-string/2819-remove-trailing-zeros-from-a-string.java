class Solution {
    public String removeTrailingZeros(String num) {
        return removeTrailingZeroesfunc(num);
    }
    String removeTrailingZeroesfunc(String s) {
        StringBuilder sb = new StringBuilder(s);
        while (sb.length() > 0 && sb.charAt(sb.length() - 1) == '0') {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

}