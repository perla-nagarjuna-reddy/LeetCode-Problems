class Solution {
    public int countPoints(String rings) {
        HashMap<Character,Set<Character>> ms = new HashMap<>();

        for(int i=1;i<rings.length();i+=2){
            if(!ms.containsKey(rings.charAt(i))){
                ms.put(rings.charAt(i),new HashSet<Character>());
            }
            ms.get(rings.charAt(i)).add(rings.charAt(i-1));
        }
        int count=0;
        for(char s:ms.keySet()){
            if(ms.get(s).size()==3)
            count++;
        }
        return count;
    }
}