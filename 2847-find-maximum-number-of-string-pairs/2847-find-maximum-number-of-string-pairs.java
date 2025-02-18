class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int count = 0;

        for(int i = 0 ; i < words.length ; i++){
            for(int j = i+1; j < words.length ; j++){
                String rev_st = do_reverse(words[j]);

                if(words[i].equals(rev_st)){
                    count++;
                }
            }
        }

        return count;
    }

    public String do_reverse(String s){
        StringBuilder sb = new StringBuilder();

        sb.append(s);

        sb.reverse();

        return sb.toString();
    }
}