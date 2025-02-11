class Solution {
    public List<String> letterCombinations(String digits) {

        HashMap<Integer,List<String>> map = new HashMap<>();

        map.put(2,Arrays.asList("a","b","c"));
        map.put(3,Arrays.asList("d","e","f"));
        map.put(4,Arrays.asList("g","h","i"));
        map.put(5,Arrays.asList("j","k","l"));
        map.put(6,Arrays.asList("m","n","o"));
        map.put(7,Arrays.asList("p","q","r","s"));
        map.put(8,Arrays.asList("t","u","v"));
        map.put(9,Arrays.asList("w","x","y","z"));
        List<String> ans = new ArrayList<>();
        List<String> res = new ArrayList<>();
         if(digits.length() == 0){
            return ans;
        }
        solve(0,digits,map,ans,res);

        return ans;
    }

    public void solve(int index,String digits,HashMap<Integer,List<String>> map,List<String> ans,List<String> res){
        if(index == digits.length()){
            String st = "";
            for(String l : res){
                st = st + l;
            }
            ans.add(st);
            return;
        }

        int num = digits.charAt(index) - 48;

        for(String s : map.get(num)){
            res.add(s);
            solve(index+1,digits,map,ans,res);
            res.remove(res.size()-1 );
        }
    }
}