class Solution {
    public String[] spellchecker(String[] wordlist, String[] queries) {

        HashSet<String> set = new HashSet<>();


        HashMap<String,String> caseInsensitive = new HashMap<>();

        HashMap<String,String> masked = new HashMap<>();


        for(String word : wordlist){
            
            set.add(word);
            
            caseInsensitive.putIfAbsent(word.toLowerCase(),word);

            masked.putIfAbsent(vmask(word.toLowerCase()), word);


        }

        String[] ans = new String[queries.length];


        for(int i = 0 ; i < queries.length; i++){

            String word = queries[i];

            if(set.contains(word)){
                ans[i] = word;
            }
            else if(caseInsensitive.containsKey(word.toLowerCase())){
                ans[i] = caseInsensitive.get(word.toLowerCase());
            }
            else{
                String mask = word.toLowerCase().replaceAll("[aeiou]", "*");
                ans[i] = masked.getOrDefault(mask, "");

            }
        }
        return ans;
    }

    public String vmask(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') c = '*';
            sb.append(c);
        }
        return sb.toString();
    }
}