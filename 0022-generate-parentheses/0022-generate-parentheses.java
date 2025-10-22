class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();

		solve(n,0,0,"",ans);
        return ans;
    }

    public static void solve(int n,int open,int close,String op,List<String> ans){

        if(open == n && close == n){
            ans.add(new String(op));
            return;
        }

        if(open < n){
            String op1 = op;
            op1 = op1 + '(';
            solve(n,open+1,close,op1,ans);
        }
        if(close < open){
            String op2 = op;
            op2 = op2 + ')';
            solve(n,open,close + 1,op2,ans);
        }
	}
}