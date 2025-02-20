class Solution {
    public int maximumScore(int a, int b, int c) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        pq.add(a);
        pq.add(b);
        pq.add(c);

        int ans = 0;
        int count = 0;
        while(pq.size() >= 2){
            int first= pq.poll();
            int second = pq.poll();

            if(first == 0){
                pq.remove(first);
                count++;
            }

            if(second == 0){
                pq.remove(second);
                count++;
            }

            if(first > 0 && second > 0){
                pq.add(first-1);
                pq.add(second-1);
                ans++;
            }
            
        }

        return ans;
    }
}