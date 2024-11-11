class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;

        for(int val : hours){
            if(val >= target){
                count++;
            }
        }

        return count;
    }
}