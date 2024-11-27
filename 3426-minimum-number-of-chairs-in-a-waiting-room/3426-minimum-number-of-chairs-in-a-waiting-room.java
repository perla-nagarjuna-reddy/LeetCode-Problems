class Solution {
    public int minimumChairs(String s) {
        int occupied_chairs = 0;
        int max_chairs = 0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'E'){
                occupied_chairs++;
                max_chairs = Math.max(max_chairs, occupied_chairs);
            }
            else{
                occupied_chairs--;
            }
        }

        return max_chairs;
    }
}