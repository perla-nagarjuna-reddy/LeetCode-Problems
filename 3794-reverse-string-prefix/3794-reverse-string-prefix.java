class Solution {
    public String reversePrefix(String s, int k) {
        
        String fpart = s.substring(0,k);

        String spart = s.substring(k);

        StringBuilder sb = new StringBuilder(fpart);

        sb.reverse();

        sb.append(spart);

        return sb.toString();
    }
}