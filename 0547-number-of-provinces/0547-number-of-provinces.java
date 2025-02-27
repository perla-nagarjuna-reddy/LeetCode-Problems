class Solution {
    public int findCircleNum(int[][] isConnected) {
        List<Integer> ans = new ArrayList<>();
    ArrayList<ArrayList<Integer>> adjLs = new ArrayList<>();
        int n = isConnected.length;
        for(int i = 0 ; i < n ; i++){
            adjLs.add(new ArrayList<>());
        }
        
        for(int i = 0; i < n; i++){
            
            for(int j = 0 ; j < n ;j++){
                
                if(isConnected[i][j] == 1 && i != j){
                    adjLs.get(i).add(j);
                    adjLs.get(j).add(i);
                }
            }
        }
        
        int count = 0;
        
        int[] vis = new int[n];
        
        for(int i = 0; i < n ; i++){
            if(vis[i] == 0){
                count++;
                dfs(i,adjLs,vis);
            }
        }
        return count;
    }
    
    public static void dfs(int node,ArrayList<ArrayList<Integer>> adj,int[] vis){
        vis[node] = 1;
        
        for(int val : adj.get(node)){
            if(vis[val] == 0){
                dfs(val,adj,vis);
            }
        }
    }
}