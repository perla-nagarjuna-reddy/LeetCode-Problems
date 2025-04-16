class Solution {
    public List<List<String>> displayTable(List<List<String>> orders) {
        Set<Integer> ls = new HashSet<>();
        List<String> set = new ArrayList<>();
        for(int i = 0 ; i < orders.size(); i++){

            String st = orders.get(i).get(2);
            
            int val = Integer.valueOf(orders.get(i).get(1));

            ls.add(val);
            
            if(!set.contains(st)){
                set.add(st);
            }
        }

        Collections.sort(set);

        List<List<String>> ans = new ArrayList<>();

        List<String> head = new ArrayList<>();

        head.add("Table");

        head.addAll(set);

        HashMap<Integer,HashMap<String,Integer>> map = new HashMap<>();

        for(int i = 0; i < orders.size(); i++){


            String food = orders.get(i).get(2);

            int tableNo = Integer.valueOf(orders.get(i).get(1));
            map.putIfAbsent(tableNo, new HashMap<>());
            Map<String, Integer> foodCount = map.get(tableNo);
            foodCount.put(food, foodCount.getOrDefault(food, 0) + 1);
        }

        for (int table : map.keySet()) {
            List<String> row = new ArrayList<>();
            row.add(String.valueOf(table));
            Map<String, Integer> foodCount = map.get(table);
            for (String food : set) {
                row.add(String.valueOf(foodCount.getOrDefault(food, 0)));
            }
            ans.add(row);
        }

        Collections.sort(ans,(a,b) -> Integer.valueOf(a.get(0)) - Integer.valueOf(b.get(0)));

        ans.add(0,head);
        return ans;

    }
}