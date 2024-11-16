class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drunk = 0;

        int empty = 0;

        while(numBottles > 0){
            drunk = drunk + numBottles;
            empty = empty + numBottles;

            numBottles = empty / numExchange;
            empty = empty % numExchange;
        }
        return drunk;
    }
}