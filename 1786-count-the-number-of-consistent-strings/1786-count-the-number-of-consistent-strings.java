class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        List<Character> lst = new ArrayList<>();
        int count = 0;
        for(char ch : allowed.toCharArray()){
            lst.add(ch);
        }

        for(int i=0;i<words.length;i++){
            boolean isContain = false;
            for(int j=0;j<words[i].length();j++){
                if(!lst.contains(words[i].charAt(j))){
                    isContain = true;
                }
            }

            if(!isContain){
                count++;
            }
        }

        return count;
    }
}