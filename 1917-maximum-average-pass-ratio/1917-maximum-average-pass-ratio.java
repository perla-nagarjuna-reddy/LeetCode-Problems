class Pair{
    int ind;
    double avg;
    public Pair(double avg,int ind){
        this.ind = ind;
        this.avg = avg;
    }
}
class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<Pair> pq =  new PriorityQueue<>((a, b) -> Double.compare(b.avg, a.avg));

        for(int i=0;i<classes.length;i++){
            int[] arr = classes[i];
            double currentRatio = (double) arr[0] / arr[1];
            double newRatio = (double) (arr[0] + 1) / (arr[1] + 1);
            double gain = newRatio - currentRatio;
            pq.add(new Pair(gain, i));

        }

        while(extraStudents-- > 0){
            Pair temp = pq.poll();
            int i = temp.ind;
            classes[i][0]++;
            classes[i][1]++;
            double currentRatio = (double) classes[i][0] / classes[i][1];
            double newRatio = (double) (classes[i][0] + 1) / (classes[i][1] + 1);
            double gain = newRatio - currentRatio;
            pq.add(new Pair(gain, i));
        }
        
        
        double ans = 0.0;
        for (int[] arr : classes) {
            ans += (double) arr[0] / arr[1];
        }
        return ans / classes.length;
    }
}