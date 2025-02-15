class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {

        if(edges.length == 0 && n == 1){
            return true;
        }
        if(source != 0 && destination == 0){
            return false;
        }
        if(source == 0 && destination == 0){
            return true;
        }
        HashMap<Integer,List<Integer>> graph = adjacencyList(n,edges);
        int[] visited  = new int[n];
        dfs(0,graph,n,visited);
        // System.out.println(Arrays.toString(visited));
        return visited[source] == 1 && visited[destination] == 1; 
    }
    
    public HashMap<Integer,List<Integer>> adjacencyList(int n, int[][] arr){
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        for(int i = 0; i < arr.length ; i++){
            int a = arr[i][0];
            int b = arr[i][1];
            map.putIfAbsent(a, new ArrayList<>());
            map.get(a).add(b);

            map.putIfAbsent(b, new ArrayList<>());
            map.get(b).add(a);

        }
        // System.out.println(map);
        return map; 
    }
    public static void dfs(int node , HashMap<Integer,List<Integer>> graph,int n, int[] visited){
    	    
    	    // System.out.print(node+" ");
    	    visited[node] = 1;
    	    
    	    for(int val : graph.get(node)){
    	        if(visited[val] == 0){
    	            dfs(val,graph,n,visited);
    	            visited[val] = 1;
    	        }
    	    }
    	}
}