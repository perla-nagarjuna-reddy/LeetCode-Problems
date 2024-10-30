class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        
        String[] arr = paragraph.toLowerCase().split("[\\W]+");
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        for (String st : bannedSet) {
            map.remove(st);
        }
        List<Map.Entry<String, Integer>> lst = new ArrayList<>(map.entrySet());

        Collections.sort(lst,(a,b) -> b.getValue() - a.getValue());
        return lst.get(0).getKey();
    }
}