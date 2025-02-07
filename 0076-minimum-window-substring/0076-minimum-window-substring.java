class Solution {
    public String minWindow(String s, String t) {
        int[] hashArr = new int[128];
        for(char ch : t.toCharArray()){
            hashArr[ch]++;
        }
        int i = 0;
        int j = 0;
        int min = Integer.MAX_VALUE;
        int sIndex = -1;
        int count = 0;

        while(j < s.length()){
            char  rightChar = s.charAt(j);
            if(hashArr[rightChar] > 0){
                count++;
            }
            hashArr[rightChar]--;

            while(count == t.length()){
                if((j-i+1) < min){
                    min = j - i + 1;
                    sIndex = i;
                }
                char leftChar = s.charAt(i);
                hashArr[leftChar]++;

                if(hashArr[leftChar] > 0){
                    count--;
                }
                i++;
            }
            j++;
        }

        return sIndex==-1?"":s.substring(sIndex,sIndex+min);
    }
}