class Pair{
    int x;
    int y;
    double val;
    public Pair(int x, int y, double val){
        this.x = x;
        this.y = y;
        this.val = val;
    } 
}

class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {

       PriorityQueue<Pair> pq = new PriorityQueue<Pair>((a, b) -> Double.compare(a.val, b.val));

        for(int i = 0; i < arr.length; i++){

            for(int j = i+1; j < arr.length; j++){

                double fr = (double)arr[i]/arr[j];

                Pair pair = new Pair(arr[i],arr[j],fr);

                pq.add(pair);
            }
        }
        k--;

        while(k-- > 0){
            pq.poll();
        }


        Pair pair = pq.poll();

        int[] ans = {pair.x,pair.y};

        return ans;

    }
}