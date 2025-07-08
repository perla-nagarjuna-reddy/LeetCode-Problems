class Solution {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {

        int i = 0;

        int j = plants.length - 1;

        int total = 0;

        int capA = capacityA;

        int capB = capacityB;

        while(i <= j){


            if(i == j){

                if (Math.max(capA, capB) < plants[i]) {
                    total++;
                }
                break;
            }

            if(plants[i] <= capA){
                capA = capA - plants[i];
            }
            else if (plants[i] > capA){
                total++;
                capA = capacityA;
                capA = capA - plants[i];
            }

            if(plants[j] <= capB){
                capB = capB - plants[j];
            }
            else if (plants[j] > capB){
                total++;
                capB = capacityB;
                capB = capB - plants[j];
            }
            i++;
            j--;
        }

        return total;
    }
}