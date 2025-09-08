class Solution {
    public int[] getNoZeroIntegers(int n) {

    int start = 1;
    int end = n;
    int[] ans = new int[2];
    while(start <= end){
        if((start+end) == n){
            boolean value1 = checkIfNumberisdZero(start);
            boolean value2 = checkIfNumberisdZero(end);
            if(value1 && value2){
                ans[0] = start;
                ans[1] = end;
                return ans;
            }
            else{
                start++;
                end--;
            }
        }
        else if((start+end) > n){
            end--;
        }
        else{
            start++;
        }
    }
    return new int[]{-1,-1};
        
    }

    public boolean checkIfNumberisdZero(int num){
        if(num < 9){
            return true;
        }
        while(num > 0){
            int digit = num % 10;

            if(digit == 0){
                return false;
            }
            num = num/10;
        }

        return true;
    }
}