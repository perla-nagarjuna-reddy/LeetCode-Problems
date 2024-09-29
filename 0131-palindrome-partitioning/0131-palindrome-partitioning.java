class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> res = new ArrayList<>();
        solve(s,0,res,ans);
        return ans;
    }

    public void solve(String s,int ind,List<String> res,List<List<String>> ans){
        if(ind == s.length()){
            ans.add(new ArrayList<>(res));
            return;
        }

        for(int i=ind;i<s.length();i++){
            if(isPalindrome(s,ind,i)){
                res.add(s.substring(ind,i+1));
                solve(s,i+1,res,ans);
                res.remove(res.size()-1);
            }
        }
    }
    public boolean isPalindrome(String s, int start,int end){
        while(start <= end){
            if(s.charAt(start++) != s.charAt(end--)){
                return false;
            }
        }

        return true;
    }
}