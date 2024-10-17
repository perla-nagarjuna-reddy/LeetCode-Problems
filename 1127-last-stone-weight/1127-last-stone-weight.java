class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<stones.length;i++){
            pq.add(stones[i]);
        }
        System.out.println(pq);
        while(pq.size() > 1){
            int first = pq.poll();
            int second = pq.poll();
            if(first == second){
                continue;
            }else{
                pq.add(Math.abs(first - second));
            }
        }

        return pq.isEmpty()?0:pq.peek();
    }
}