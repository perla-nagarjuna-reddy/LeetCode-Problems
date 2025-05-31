class Solution {
    public int maxContainers(int n, int w, int maxWeight) {

        n = n * n;

        int sum = 0;

        int count = 0;

        for(int i = 0 ; i < n; i++){

            sum = sum + w;

            if(sum > maxWeight) break;

            if(sum <= maxWeight){
                count++;
            }
        }

        return count;
    }
}