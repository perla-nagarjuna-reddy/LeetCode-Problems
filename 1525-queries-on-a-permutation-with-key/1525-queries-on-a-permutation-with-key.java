class Solution {
    public int[] processQueries(int[] queries, int m) {
    
        List<Integer> lst = new ArrayList<>();

        int n = queries.length;

        for(int i = 1; i <= m; i++){
            lst.add(i);
        }

        int[] ans = new int[n];

        for(int i = 0 ; i < queries.length; i++){
            int num = queries[i];

            int getPos = lst.indexOf(num);

            ans[i] = getPos;

            int removedElement = lst.remove(getPos);
            lst.add(0,removedElement);
        }

        return ans;
    }
}