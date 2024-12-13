class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> b - a);

        for(int val : gifts){
            heap.add(val);
        }

        for(int i=0;i<k;i++){
            int maxEle  = heap.poll();

            int leftPiles = (int)Math.floor(Math.sqrt(maxEle));

            heap.add(leftPiles);
        }

        long ans = 0;

        while(!heap.isEmpty()){
            ans =  ans + heap.poll();
        }

        return ans;
    }
}