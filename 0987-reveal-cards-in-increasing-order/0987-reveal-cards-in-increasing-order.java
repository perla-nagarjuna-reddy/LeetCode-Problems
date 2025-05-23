class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {

        Arrays.sort(deck);

        int[] ans = new int[deck.length];

        Deque<Integer> q = new LinkedList<>();

        for(int i = 0 ; i < deck.length; i++){
            q.add(i);
        }

        int i = 0;
        while (!q.isEmpty()) {
            int index = q.poll();          
            ans[index] = deck[i++];        

            if (!q.isEmpty()) {
                q.add(q.poll());           
            }
        }

        return ans;
    }
}