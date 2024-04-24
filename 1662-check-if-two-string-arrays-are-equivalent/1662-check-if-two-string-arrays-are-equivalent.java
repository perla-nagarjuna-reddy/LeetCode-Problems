class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String st1 = "";
        String st2 = "";
        for(int i=0;i<word1.length;i++){
            st1+=word1[i];
        }
        for(int i=0;i<word2.length;i++){
            st2+=word2[i];
        }
        
        return st1.equals(st2);
    }
}