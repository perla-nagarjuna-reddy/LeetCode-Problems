class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] ans = s.split(" ");
        String val = "";
        for(int i=ans.length-1;i>=0;i--){
            String word = ans[i];
            if(!word.isEmpty()) val = val + word+" ";
            // System.out.println(word);
            // if() ;
        }

        return val.trim();
    }
}