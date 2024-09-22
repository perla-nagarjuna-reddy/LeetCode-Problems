class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();
        int[] ans = new int[A.length];
        for(int i = 0;i<A.length;i++){
            setA.add(A[i]);
            setB.add(B[i]);
            Set<Integer> commonEle= new HashSet<>(setA);
            commonEle.retainAll(setB);
            ans[i] = commonEle.size();
        }
        return ans;
    }
}