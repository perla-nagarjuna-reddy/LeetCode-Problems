class Solution {
    public int tribonacci(int n) {
        if(n == 0) return 0;
        if(n == 1){
            return 1;
        }
        int a = 0;
        int b = 1;

        int c = 1;

        for(int i=1;i<n-1;i++){
            int d = a+b+c;
            a = b;
            b = c;
            c = d;
        }

        return c;
    }
}