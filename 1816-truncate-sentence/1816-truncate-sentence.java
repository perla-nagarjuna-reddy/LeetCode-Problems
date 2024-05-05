class Solution {
    public String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        
        String st = "";
        
        for(int i=0;i<k;i++){
            st+=words[i]+" ";
        }
        return st.trim();  
    }
}