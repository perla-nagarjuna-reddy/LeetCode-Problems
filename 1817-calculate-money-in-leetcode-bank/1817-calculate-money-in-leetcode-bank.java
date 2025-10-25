class Solution {
    public int totalMoney(int n) {

        int sum = 0;

        int monday = 0;

        int ind = 1;

        int prev = 0;

        while(ind <= n){

            int day = ind % 7;

            if(day == 1){
                monday+=1;
                prev = monday;
                sum += prev;
            }
            else{
                prev = prev + 1;
                sum += prev;
            }

            ind++;
        }

        return sum;
    }
}