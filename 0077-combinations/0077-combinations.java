class Solution {
    public List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> lst = new ArrayList<>();

        solve(1,n,lst,k,new ArrayList<>());

        return lst;
    }


    public void solve(int ind,int n,List<List<Integer>> lst,int k,List<Integer> res){

        if(res.size() == k){
            lst.add(new ArrayList<>(res));

            return;
        }

        for(int i = ind; i <= n; i++){
            res.add(i);
            solve(i+1,n,lst,k,res);
            res.remove(res.size() - 1);
        }
    }
}