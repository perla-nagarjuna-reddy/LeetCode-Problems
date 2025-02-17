class Solution {
    List<String> ans = new ArrayList<>();
    public int numTilePossibilities(String tiles) {
        
        StringBuilder sb = new StringBuilder();
        char[] tileArray = tiles.toCharArray();
        Arrays.sort(tileArray);  
        int[] visited = new int[tiles.length()];
        solve(tileArray,visited,sb);

        return ans.size();
    }

    private void solve(char[] tiles, int[] visited, StringBuilder sb) {
        if (sb.length() > 0) {
            ans.add(sb.toString()); 
        }

        for (int i = 0; i < tiles.length; i++) {
            if (visited[i] == 1) continue;

            if (i > 0 && tiles[i] == tiles[i - 1] && visited[i - 1] == 0) continue;

            visited[i] = 1;
            sb.append(tiles[i]);

            solve(tiles, visited, sb);

            sb.deleteCharAt(sb.length() - 1);
            visited[i] = 0;
        }
    }
}