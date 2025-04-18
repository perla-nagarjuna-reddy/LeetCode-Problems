class Solution {
    public int minStoneSum(int[] piles, int k) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);

        for(int val : piles){
            pq.add(val);
        }

        while(k-- > 0){
            int removedStone = (int)Math.ceil(pq.poll() / 2.0);

            pq.add(removedStone);
        }

        int ans = 0;


        while(!pq.isEmpty()){
            ans = ans + pq.poll();
        }

        return ans;
    }
    
}