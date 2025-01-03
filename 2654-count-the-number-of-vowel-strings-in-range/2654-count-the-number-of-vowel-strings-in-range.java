class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        Set<Character> lst = new HashSet<>();
        lst.add('a');
        lst.add('e');
        lst.add('i');
        lst.add('o');
        lst.add('u');
        
        for (int i = left; i <= right; i++) {
            String word = words[i];
            if (lst.contains(word.charAt(0)) && lst.contains(word.charAt(word.length() - 1))) {
                count++;
            }
        }

        return count;
    }
}