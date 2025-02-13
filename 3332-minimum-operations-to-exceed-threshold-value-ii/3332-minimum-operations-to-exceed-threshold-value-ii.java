class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();

        for(int num : nums){
            pq.add((long)num); 
        }
        
        int ans = 0;

        
        while(!pq.isEmpty() && pq.size() >= 2){

            if(pq.peek() >= k){
                break;
            }
            else{
                long first = pq.poll();
                long second = pq.poll();

                long min = Math.min(first,second);
                long max = Math.max(first,second);

                long newNum = min * 2 + max;
                pq.add(newNum);
                
                ans++;
            }
        }

        return ans;
    }
}