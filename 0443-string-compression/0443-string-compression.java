class Solution {
    public int compress(char[] chars) {

        if(chars.length == 1) return 1;

        int count = 1;

        char prev = chars[0];

        StringBuilder sb = new StringBuilder();

        for(int i = 1; i < chars.length; i++){

            char current = chars[i];

            if(current == prev) count++;

            if(count == 1 && current != prev) sb.append(prev);

            if(count > 1 && current != prev){
                sb.append(prev);
                sb.append(count);
                count = 1;
            }

            prev = current;
        }
        if(count != 1){
            sb.append(prev);
            sb.append(count);
        }
        else{
            sb.append(prev);
        }
        char[] ch = sb.toString().toCharArray();
        
        for (int i = 0; i < ch.length; i++) {
            chars[i] = ch[i];
        }
        return ch.length;
    }
}