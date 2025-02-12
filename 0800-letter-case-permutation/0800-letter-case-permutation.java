class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> ans = new ArrayList<>();

        solve(s,"",ans);

        return ans;
    }
    public static void solve(String ip,String op,List<String> ans){
	    if(ip.length() == 0){
	        ans.add(new String(op));
	        return;
	    }
	    
	    if(!Character.isDigit(ip.charAt(0))){
	        String op1 = op;
	        String op2 = op;
	        op1 = op1+Character.toLowerCase(ip.charAt(0));
	        op2 = op2+Character.toUpperCase(ip.charAt(0));
	        solve(ip.substring(1),op1,ans);
	        solve(ip.substring(1),op2,ans);
	    }else{
	        String op1 = op;
            op1 = op1+ip.charAt(0);
            solve(ip.substring(1),op1,ans);
	    }
    }

}