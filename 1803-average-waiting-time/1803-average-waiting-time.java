class Solution {
    public double averageWaitingTime(int[][] customers) {
        long waitingTime = 0;
        long completionTime = customers[0][0] + customers[0][1];
        waitingTime = completionTime - customers[0][0];
        long currentTime = completionTime;
        for(int i = 1; i < customers.length;i++){
            if(currentTime <= customers[i][0]){
                completionTime = customers[i][0] + customers[i][1];
                waitingTime = waitingTime + (completionTime - customers[i][0]);
                currentTime = completionTime;
            }
            else if (currentTime > customers[i][0]){
                completionTime = completionTime + customers[i][1];
                waitingTime = waitingTime + (completionTime - customers[i][0]);
                currentTime = completionTime;
            }
        }    

        return (double) waitingTime / customers.length;    
    }
}