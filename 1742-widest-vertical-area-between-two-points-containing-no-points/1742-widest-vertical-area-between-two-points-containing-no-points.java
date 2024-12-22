class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        ArrayList<Integer> lst = new ArrayList<>();

        for(int i=0;i<points.length;i++){
            lst.add(points[i][0]);
        }
        Collections.sort(lst);

        int max  = 0;

        for(int i=0;i<lst.size()-1;i++){
            if(lst.get(i+1) - lst.get(i) > max){
                max = lst.get(i+1) - lst.get(i);
            }
        }
        return max;
    }
}