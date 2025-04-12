class Solution {
    public int countVowelStrings(int n) {
        
        String[] s = {"a","e","i","o","u"};

        List<String> lst = new ArrayList<>();

        solve(0,n,s,"",lst);

        return lst.size();
    }

    public void solve(int index,int n,String[] s,String current,List<String> lst){

       if(current.length() == n){
            lst.add(new String(current));
            return;
        }

        for(int i =  index  ; i < s.length; i++){
            solve(i,n,s,current+s[i],lst);
        }
    }
}