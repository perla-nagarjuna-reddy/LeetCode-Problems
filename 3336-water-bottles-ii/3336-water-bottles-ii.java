class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {

        int drunk = numBottles;

        int empty = numBottles;


        while(empty >= numExchange){
            int newB = 1;
            drunk+=newB;
            empty = empty - numExchange + 1; // to add into emtpy bottle list of new full bottle
            numExchange++;
        }     
        return drunk;
    }
}