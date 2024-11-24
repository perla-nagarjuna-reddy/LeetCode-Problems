class Solution {
    public int commonFactors(int a, int b) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for(int i=1;i<=a;i++){
            if(a % i == 0){
                map.put(i,1);
            }
        }
        for(int i=1;i<=b;i++){
            if(b % i == 0){
                if(map.containsKey(i)){
                    count++;
                }
            }
        }

        return count;
    }
}