class Solution 
{
    public int maxEvents(int[][] events) 
    {

        Arrays.sort(events, (a, b) -> Integer.compare(a[0], b[0]));
        PriorityQueue<Integer> pq = new PriorityQueue<>(); 
        
        int i = 0;
        int count = 0;
        int n = events.length;


        int lastDay = 0;
        for (int[] e : events) 
        {
            lastDay = Math.max(lastDay, e[1]);
        }

        for (int day = 1; day <= lastDay; day++) 
        {

            while (i < n && events[i][0] == day) 
            {
                pq.offer(events[i][1]);
                i++;
            }
            while (!pq.isEmpty() && pq.peek() < day) 
            {
                pq.poll();
            }

            if (!pq.isEmpty()) 
            {
                pq.poll();
                count++;
            }
        }
        return count;
    }
}