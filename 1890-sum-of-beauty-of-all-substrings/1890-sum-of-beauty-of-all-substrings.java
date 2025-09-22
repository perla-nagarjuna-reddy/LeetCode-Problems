class Solution {
    public int beautySum(String s) {
        

        int sum  = 0;


        for(int i = 0 ; i < s.length(); i++){

            for(int j = i; j < s.length(); j++){

                String str = s.substring(i,j+1);

                int[] freq = new int[26];

                for(char ch : str.toCharArray()){

                    freq[ch - 'a']++;
                }

                int min = Integer.MAX_VALUE;

                int max = 0;

                for (int k = 0 ; k < 26; k++) {
                    
                    if(freq[k] > 0){
                        max = Math.max(max, freq[k]);
                        min = Math.min(min, freq[k]);
                    }
                }

                sum += (max - min);
            }
        }

        return sum;
    }
}