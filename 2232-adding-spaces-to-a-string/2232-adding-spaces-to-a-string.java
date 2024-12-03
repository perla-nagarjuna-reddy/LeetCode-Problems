class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder ans = new StringBuilder();

        for(int i=0;i<spaces.length;i++){
           
            if(i == 0){
                if(spaces[i] == 0){
                   ans.append("");
                }
                ans.append(s.substring(0,spaces[i])+" ");
            }
            else{
                ans.append(s.substring(spaces[i-1],spaces[i])+" ");
            }
        }
        ans.append(s.substring(spaces[spaces.length - 1]));
        return ans.toString();
    }
}