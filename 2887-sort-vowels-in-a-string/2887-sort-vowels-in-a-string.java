class Solution {
    public String sortVowels(String s) {

        List<Character> chars = new ArrayList<>();

        for(char ch : s.toCharArray()){

            String r = String.valueOf(ch);

            if("aeiou".contains(r) || "AEIOU".contains(r)){
                    chars.add(ch);
            }
        }

        Collections.sort(chars);

        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < s.length(); i++){

            String r = String.valueOf(s.charAt(i));

            if("aeiou".contains(r) || "AEIOU".contains(r)){
                sb.append(chars.get(0));
                chars.remove(0);
            }
            else{
                sb.append(r);
            }

        }

        return sb.toString();
    }
}