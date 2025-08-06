class Solution {
    public int countVowelSubstrings(String word) {
        

        int count = 0;

        List<Character> lst = List.of('a','e','i','o','u');

        for(int i = 0 ; i < word.length(); i++){

            for(int j = i; j < word.length(); j++){

                HashSet<Character> set = new HashSet<>();

                for(int k = i; k <= j; k++){
                    set.add(word.charAt(k));
                }

                if(set.size() >= 5){
                    boolean isContain = true;
                    for(char ch : set){

                        if(!lst.contains(ch)){
                            isContain = false;
                            break;
                        }
                    }

                    if(isContain){
                        count++;
                    }
                }
            }
        }

        return count;
    }
}