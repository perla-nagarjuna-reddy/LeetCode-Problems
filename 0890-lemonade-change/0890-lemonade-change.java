class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fiveCounter = 0;
        int tenCounter = 0;

        for(int i=0;i<bills.length;i++){
            if(bills[i] == 5){
                fiveCounter+=5;
            }
            else if(bills[i] == 10){

                if(fiveCounter != 0){
                    fiveCounter = fiveCounter - 5;
                    tenCounter = tenCounter + 10;
                }
                else{
                    return false;
                }
            }
            else if(bills[i] == 20){
                if(tenCounter != 0 && fiveCounter != 0){
                    fiveCounter = fiveCounter - 5;
                    tenCounter = tenCounter - 10;
                }
                else if(tenCounter == 0 && fiveCounter >= 15){
                    fiveCounter = fiveCounter - 15;
                }
                else{
                    return false;
                }
            }
        }

        return true;
    }
}