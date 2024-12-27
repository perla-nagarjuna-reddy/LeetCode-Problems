class ParkingSystem {
    int countB;
    int countM;
    int countS;

    public ParkingSystem(int big, int medium, int small) {
        countB = big;
        countM = medium;
        countS = small;
    }
    
    public boolean addCar(int carType) {
        if(carType == 1){
            if(countB > 0){
                countB--;
                return true;
            }
            else{
                return false;
            }
        }
        else if(carType ==2){
            if(countM > 0){
                countM--;
                return true;
            }
            else{
                return false;
            }
        }
        else {
            if(countS > 0){
                countS--;
                return true;
            }
            else{
                return false;
            }
        }

    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */