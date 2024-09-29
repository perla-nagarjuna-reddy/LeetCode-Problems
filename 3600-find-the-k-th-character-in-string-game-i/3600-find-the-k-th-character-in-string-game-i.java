class Solution {
    public char kthCharacter(int k) {
        StringBuilder sb = new StringBuilder("ab");
        while(sb.length() < k){ 
            int currentLen = sb.length();
            for(int i=0;i<currentLen;i++){
                char chAlpha = (char)(sb.charAt(i)+1);
                if(chAlpha > 'z'){
                    chAlpha = 'a';
                }
                sb.append(chAlpha);
            }
            
            
        }
        return sb.charAt(k-1);
    }
}