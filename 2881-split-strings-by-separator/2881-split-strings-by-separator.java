import java.util.regex.Pattern;
class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        
        List<String> ans = new ArrayList<>();

        for(int i = 0; i < words.size(); i++){

            String[] arr = words.get(i).split("\\"+separator);

            for(String st : arr){
                if(!st.isEmpty()){
                    ans.add(st);
                }
            }

        }

        return ans;
    }
}