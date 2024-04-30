class Solution {
    public boolean checkIfPangram(String sentence) {
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i=0;i<sentence.length();i++){
            map.put(sentence.charAt(i),map.getOrDefault(sentence.charAt(i),0)+1);
        }
        for(int i=97;i<=122;i++){
            char ch = (char)i;
            
            if(!map.containsKey(ch)){
                return false;
            }
            
        }
        return true;
    }
}