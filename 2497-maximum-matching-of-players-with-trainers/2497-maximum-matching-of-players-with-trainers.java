class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        Arrays.sort(players);

        for(int val : trainers){
            pq.add(val);
        }

        int count = 0;

        for(int val : players){

            while (!pq.isEmpty() && pq.peek() < val) {
                pq.poll();
            }

            if(!pq.isEmpty()){
                pq.poll();
                count++;
            }
            else{
                break;
            }
        }

        return count;
    }
}