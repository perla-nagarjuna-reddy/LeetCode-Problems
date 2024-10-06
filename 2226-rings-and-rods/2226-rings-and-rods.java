class Solution {
    public int countPoints(String rings) {
        int count = 0;
        for(int i=0;i<=9;i++){
            int B = 0 ;
            int G = 0 ;
            int R = 0 ;

            for(int j=1;j<rings.length();j+=2){
                if(Integer.valueOf(rings.charAt(j)) - 48 == i && rings.charAt(j-1) == 'B'){
                    B++;
                }
                if(Integer.valueOf(rings.charAt(j)) - 48 == i && rings.charAt(j-1) == 'G'){
                    G++;
                }
                if(Integer.valueOf(rings.charAt(j))-48 == i && rings.charAt(j-1) == 'R'){
                    R++;
                }
            }

            if(B >= 1 && G >=1 && R>=1){
                count++;
            }

        }

        return count;
    }
}