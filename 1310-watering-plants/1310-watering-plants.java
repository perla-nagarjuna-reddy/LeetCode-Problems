class Solution {
    public int wateringPlants(int[] plants, int capacity) {

        int totalSum = 0;

        int totalCap = capacity;


        for(int i = 0; i < plants.length; i++){

            if(plants[i] <= totalCap){

                totalCap = totalCap - plants[i];

                totalSum++;
            }
            else if(plants[i] > totalCap){
                int totalAdditionalSteps =  i - 0;
                totalCap = capacity;
                totalSum = totalSum + totalAdditionalSteps;
                if(plants[i] <= capacity){
                    totalCap = totalCap - plants[i];
                    totalSum = totalSum + (totalAdditionalSteps+1);
                }
            }
        }

        return totalSum;
    }
}