class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> res = new ArrayList<>();

        int [] visited = new int[graph.length];

        int [] current_path = new int[graph.length];
        for(int i = 0; i < graph.length ; i++){
            if(visited[i] == 0){
                boolean ans = dfs(i,visited,current_path,graph);
            }
        }

        for(int i = 0; i < current_path.length;i++){
            if(current_path[i] == 0){
                res.add(i);
            }
        }

        return res;

    }

    public boolean dfs(int node,int[] visited,int[] current_path,int[][] graph){

        visited[node] = 1;
        current_path[node] = 1;

        for(int val : graph[node]){
            if(visited[val] == 0){
                boolean ans = dfs(val,visited,current_path,graph);
                if(ans == true){
                    return true;
                }
            }
            else{
                if(current_path[val] == 1){
                    return true;
                }
            }
        }

        current_path[node] = 0;

        return false;
        
    } 
}