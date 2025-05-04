class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        
        Map<Pair<Integer,Integer>,Integer> count = new HashMap<>();
        int res=0;
        for(int[] domino:dominoes){
            Arrays.sort(domino);
            Pair<Integer,Integer> pair =new Pair(domino[0],domino[1]);
            res+=count.getOrDefault(pair,0);
            count.merge(pair,1,Integer::sum);
        }
        return res;
    }
}