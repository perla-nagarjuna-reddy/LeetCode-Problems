class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int count = 0;
        int n = colors.length;
        for(int i=0;i<colors.length;i++){
            int left = colors[(i - 1 + n) % n];
            int right = colors[(i+1) % n];

            if(colors[i] != left && colors[i] != right){
                count++;
            }
        }

        return count;
    }
}