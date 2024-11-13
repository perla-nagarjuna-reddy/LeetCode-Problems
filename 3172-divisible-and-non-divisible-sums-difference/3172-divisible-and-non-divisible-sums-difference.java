class Solution {
    public int differenceOfSums(int n, int m) {
        int Divisible = 0;

        int notDivisible = 0;

        for(int i=1;i<=n;i++){
            if(i % m == 0){
                Divisible+=i;
            }
            if(i % m != 0){
                notDivisible+=i;
            }
        }

        return notDivisible - Divisible;
    }
}