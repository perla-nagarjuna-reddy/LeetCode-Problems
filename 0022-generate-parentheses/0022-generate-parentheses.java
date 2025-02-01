class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        int open = n;
		int close = n;
		solve(open,close,"",ans);
        return ans;
    }

    public static void solve(int open,int close,String op,List<String> ans){
	    if(open == 0 && close == 0){
	        ans.add(new String(op));
	        return;
	    }
	    
	    if(open != 0){
	        String op1 = op;
	        op1 = op1 + "(";
	        solve(open-1,close ,op1,ans);
	    }
	    
	    if(close > open){
	       String op2 = op;
	       op2 = op2 + ")";
	       solve(open,close-1 ,op2,ans);
	    }
	}
}