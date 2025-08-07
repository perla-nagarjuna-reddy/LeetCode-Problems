import java.util.regex.Pattern;
class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        
        List<String> ans = new ArrayList<>();

        for(int i = 0; i < words.size(); i++){

            String[] arr = words.get(i).split(Pattern.quote(String.valueOf(separator)));

            for(String st : arr){
                if(st.length() > 0){
                    ans.add(st);
                }
            }

        }

        return ans;
    }
}