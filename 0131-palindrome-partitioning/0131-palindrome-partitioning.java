class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> res = new ArrayList<>();
        solve(s,0,res,ans);
        return ans;
    }

    public void solve(String s,int index,List<String> res,List<List<String>> ans){
        if(index == s.length()){
            ans.add(new ArrayList<>(res));
            return;
        }

        for(int i = index ; i < s.length() ; i++){

            if(checkIfPalindrome(s,index,i)){
                res.add(s.substring(index,i+1));
                solve(s,i+1,res,ans);
                res.remove(res.size()-1);
            }
        }
    }

    public boolean checkIfPalindrome(String s, int i,int j){
        int start = i;
        int end = j;

        while(start <= end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}