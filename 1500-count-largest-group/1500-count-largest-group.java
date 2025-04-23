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

        int maxSize = 0;
        int count = 0;

        for (List<Integer> group : map.values()) {
            int size = group.size();
            if (size > maxSize) {
                maxSize = size;
                count = 1;
            } else if (size == maxSize) {
                count++;
            }
        }

        return count;
    }
}