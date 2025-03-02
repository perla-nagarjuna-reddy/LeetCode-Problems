class Solution {
    public boolean isBipartite(int[][] adj) {
        int n = adj.length;
        
        int[] color = new int[n];
        
        Arrays.fill(color,-1);
        
        for(int i = 0 ; i < n ;i++){
            if(color[i] == -1){
                boolean ans = dfs(i,0,adj,color);
                
                if(ans == false){
                    return false;
                }
            }
        }
        
        return true;
        
    }
    
    public boolean dfs(int node, int col,int[][] adj,int[] color){
        
        color[node] = col;
        
        for(int adjNode : adj[node]){
            
            if(color[adjNode] == -1){
                if(dfs(adjNode,1 - col,adj,color) == false){
                    return false;
                }
            }
            else if(color[adjNode] == col){
                return false;
            }
            
        }
        
        return true;
    }
}