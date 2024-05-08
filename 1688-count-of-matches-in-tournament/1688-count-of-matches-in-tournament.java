class Solution {
    public int numberOfMatches(int n) {
        int totalMatches = 0;
        if(n == 1){
            return 0;
        }
        while(true){
            
            if(n % 2 == 0){
                int matches = n / 2;
                int advance = n / 2;
                n = advance;
                totalMatches+=matches;
                if(matches == 1){
                    break;
                }
            }
            else{
                int matches = (n-1) / 2;
                int advance = (n-1) / 2 + 1;
                System.out.println(advance);
                System.out.println(matches);
                n = advance;
                totalMatches+=matches;
                if(n == 1){
                    break;
                }
            }
        }
        return totalMatches;
    }
}