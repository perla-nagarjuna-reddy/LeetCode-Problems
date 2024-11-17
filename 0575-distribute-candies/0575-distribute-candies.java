class Solution {
    public int distributeCandies(int[] candyType) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = candyType.length / 2;

        for(int i=0;i<candyType.length;i++){
            map.put(candyType[i],map.getOrDefault(candyType[i],0)+1);
            if(map.size() >= max){
                break;
            }
        }

        return map.size();
    }
}