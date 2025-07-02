class Solution {
    public String[] findWords(String[] words) {
        List<String> lst = new ArrayList<>();

        String first = "qwertyuiop";
        String second = "asdfghjkl";
        String third = "zxcvbnm";

        for(int i = 0 ; i < words.length; i++){

            boolean isFirst = true;
            boolean isSecond = true;
            boolean isThird = true;
            

            for(int j = 0 ; j < words[i].length(); j++){

                char ch = Character.toLowerCase(words[i].charAt(j));

                if(isFirst && !first.contains(String.valueOf(ch))){
                    isFirst = false;
                }
                if(isSecond && !second.contains(String.valueOf(ch))){
                    isSecond = false;
                }
                if(isThird && !third.contains(String.valueOf(ch))){
                    isThird = false;
                }
            }

            if(isFirst || isSecond || isThird){
                lst.add(words[i]);
            }
        }
        return lst.toArray(new String[0]);
    }
}