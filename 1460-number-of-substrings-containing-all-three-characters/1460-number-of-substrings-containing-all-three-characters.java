class Solution {
    public int numberOfSubstrings(String s) {
        int[] lastSeen = new int[3];
        int cnt = 0;
        Arrays.fill(lastSeen,-1);
        for(int i=0;i<s.length();i++){
            lastSeen[s.charAt(i)-'a'] = i;
            if(lastSeen[0] != -1 && lastSeen[0] != -1 && lastSeen[0] != -1){
                cnt = cnt+(1+Math.min(Math.min(lastSeen[0],lastSeen[1]),Math.min(lastSeen[1],lastSeen[2])));
            }
        }

        return cnt;

    }
}