class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        Map<Integer,Integer> map = new HashMap<>();

        List<List<Integer>> lst = new ArrayList<>();

        for(int[] arr : items1){
            map.put(arr[0],map.getOrDefault(arr[0],0)+arr[1]);
        }
        for(int[] arr : items2){
            map.put(arr[0],map.getOrDefault(arr[0],0)+arr[1]);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            List<Integer> temp = new ArrayList<>();
            temp.add(entry.getKey());
            temp.add(entry.getValue());
            lst.add(temp);
        }

        lst.sort((a, b) -> Integer.compare(a.get(0), b.get(0)));

        return lst;

    }
}