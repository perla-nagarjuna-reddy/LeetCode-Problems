class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int count_0 = 0;
        int count_1 = 0;

        for(int val : students){
            if(val == 0){
                count_0++;
            }
            else{
                count_1++;
            }
        }

        for(int val : sandwiches){
            if(count_0 > 0 && val == 0){
                count_0--;
            }
            else if(count_1 > 0 && val == 1){
                count_1--;
            }
            else {
                break;
            }

        }

        if(count_0 == 0 && count_1 == 0){
            return 0;
        }
        if(count_0 == 0){
            return count_1;
        }
        return count_0;
    }
}