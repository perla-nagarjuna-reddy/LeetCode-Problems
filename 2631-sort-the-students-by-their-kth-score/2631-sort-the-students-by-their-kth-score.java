class Pair{
    int val;
    int pos;

    public Pair(int val,int pos){
        this.val = val;
        this.pos = pos;
    }
}
class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {

        int m = score.length;

        int n = score[0].length;

        int[][] ans = new int[m][n];

        List<Pair> lst = new ArrayList<>();

        for(int i = 0 ; i < m; i++){
            int val = score[i][k];
            Pair pair = new Pair(val,i);
            lst.add(pair);
        }

        Collections.sort(lst,(a,b) -> b.val - a.val);
        
        for(int i = 0 ; i < lst.size();i++){
            Pair pair = lst.get(i);
            ans[i] = score[pair.pos];
        }

        return ans;
    }
}