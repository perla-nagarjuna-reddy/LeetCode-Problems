class Solution {
    public String compressedString(String word) {

        int count = 1;

        char prev = word.charAt(0);

        StringBuilder sb = new StringBuilder();

        for(int i = 1; i < word.length(); i++){

            char current = word.charAt(i);

            if(current == prev) count++;

            if(count == 0){
                count = 1;
                prev = current;
            }

            if(current != prev){
                sb.append(count);
                sb.append(prev);
                count = 1;
            }
            else{

                if(count >= 9 && prev == current){
                    sb.append(count);
                    sb.append(prev);
                    count = 0;
                }
            }
            prev = current;
        }
        if(count != 0){
            sb.append(count);
            sb.append(prev);
        }
        return sb.toString();
    }
}