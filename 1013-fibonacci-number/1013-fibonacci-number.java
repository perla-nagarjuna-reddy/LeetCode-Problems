class Solution {
    public int fib(int n) {
        return findNthfib(n);
    }

    public int findNthfib(int n){
        if(n <= 1){
            return n;
        }
        return findNthfib(n-1)+findNthfib(n-2);
    }
}