class Solution {
    public int countLargestGroup(int n) {

        HashMap<Integer,List<Integer>> map = new HashMap<>();

        for(int i = 1; i <= n; i++){


            int sum = 0;

            int temp = i;

            while(temp > 0){
                int digit = temp % 10;

                sum = sum + digit;

                temp = temp / 10;
            }
            map.computeIfAbsent(sum, k -> new ArrayList<>()).add(i);
        }

        List<Map.Entry<Integer, List<Integer>>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list,(a,b) -> b.getValue().size() - a.getValue().size());


        int size = list.get(0).getValue().size();

        int count  = 0;

        for(Map.Entry<Integer, List<Integer>> set : list){

            if(set.getValue().size() == size){
                count++;
            }
        }

        return count;
    }
}