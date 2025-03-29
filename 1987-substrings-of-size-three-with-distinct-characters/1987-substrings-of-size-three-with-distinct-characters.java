class Solution {
    public int countGoodSubstrings(String s) {
        
        int i = 0; 
        
        int j = 0;

        int n = s.length();

        int count = 0;

        while(j < n){

            if((j - i + 1) < 3){
                j++;
            }
            else if((j-i+1) == 3){

                Set<Character> set = new HashSet<>();

                for(int k = i; k <= j; k++){
                    set.add(s.charAt(k));
                }
                
                if(set.size() == 3) count++;
                i++;
                j++;
            } 
        }

        return count;
    }
}