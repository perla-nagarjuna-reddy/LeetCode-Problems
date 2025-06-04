class Solution {
    public boolean squareIsWhite(String coordinates) {

        HashSet<Character> set = new HashSet<>();

        set.add('a');
        set.add('c');
        set.add('e');
        set.add('g');


        char ch = coordinates.charAt(0);

        if(set.contains(ch)){

            int num = coordinates.charAt(1) - '0';

            if(num % 2 == 1) return false;

            return true;
        }
        else{

            int num = coordinates.charAt(1) - '0';

            if(num % 2 == 1) return true;
        }

        return false;
    }
}