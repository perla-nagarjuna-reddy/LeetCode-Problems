class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> map = new HashMap<>();
        char nextChar = 'a';
        for (char c : key.toCharArray()) {
            if (c != ' ' && !map.containsKey(c)) {
                map.put(c, nextChar); 
                nextChar++;
            }
        }

        StringBuilder sb = new StringBuilder();

        for(char ch : message.toCharArray()){

            if (ch == ' ') {
                sb.append(' ');
            } else {
                sb.append(map.get(ch));
            }
        }

        return sb.toString();
    }
}