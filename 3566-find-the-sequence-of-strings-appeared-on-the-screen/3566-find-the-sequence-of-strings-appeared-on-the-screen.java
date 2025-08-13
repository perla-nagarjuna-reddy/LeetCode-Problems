class Solution {
    public List<String> stringSequence(String target) {
        
        List<String> ans = new ArrayList<>();

        StringBuilder last = new StringBuilder("a");

        ans.add(last.toString());

        int ind= 0;

        while(true){

            if(last.toString().equals(target)){
                break;
            }

            if(last.charAt(ind) == target.charAt(ind)){
                ind++;
                last.append("a");
                ans.add(last.toString());
            }
            else{
                while(last.charAt(ind) != target.charAt(ind)){
                    char ch = (char)(last.charAt(ind) + 1);
                    last.setCharAt(ind,ch);
                    ans.add(last.toString());
                }
            }
        }

        return ans;
    }
}