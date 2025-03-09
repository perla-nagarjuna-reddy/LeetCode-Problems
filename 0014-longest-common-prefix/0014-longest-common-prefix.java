class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        StringBuilder sb = new StringBuilder();

        Arrays.sort(strs);

        String firstWord = strs[0];

        String lastWord = strs[strs.length - 1];

        int i = 0;

        while(i < firstWord.length() && i < lastWord.length() && firstWord.charAt(i) == lastWord.charAt(i)){
            i++;
        }

        return firstWord.substring(0,i);
    }
}