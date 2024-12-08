class Solution {
    public int distinctIntegers(int n) {
        if(n == 1) return 1;
        Set<Integer> set = new HashSet<>();

        int num = n;

        for(int i = num ; i >= 1; i--){
            for(int j=2;j <= num;j++){
                if(i % j == 1){
                    set.add(i);
                }
            }
        }

        return set.size();
    }
}