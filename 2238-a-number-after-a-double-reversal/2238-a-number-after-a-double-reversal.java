class Solution {
    public boolean isSameAfterReversals(int num) {
        int n = reverse(num);
        System.out.println(n);
        int a = reverse(n);
        if(a == num) return true;
        return false;

    }

    public int reverse(int num){
        int rev = 0;

        while(num > 0){
            int digit = num % 10;
            rev = rev*10+digit;
            num = num / 10;
        }
        return rev;
    }
}