class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
         int sumA = 0, sumB = 0;
        for (int a : aliceSizes) sumA += a;
        for (int b : bobSizes) sumB += b;

        int diff = (sumA - sumB) / 2;

        HashSet<Integer> set = new HashSet<>();

        for(int val : aliceSizes) set.add(val);


        for(int  x :bobSizes){

            int  y = x + diff;

            if(set.contains(y)){
                return new int[]{y,x};
            }
        }


        return new int[]{-1,-1};
    }
}