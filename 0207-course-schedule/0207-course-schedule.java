class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i = 0; i < numCourses; i++){
            adj.add(new ArrayList<>());
        }

        for(int i = 0 ; i < prerequisites.length; i++){
            int first = prerequisites[i][0];
            int second = prerequisites[i][1];

            adj.get(second).add(first);
        }

        int n = adj.size();

        int[] vis = new int[n];

        int[] pathVis = new int[n];


        for(int i = 0; i < numCourses ; i++){
            if(vis[i] == 0){
                boolean ans = checkCycle(i,adj,vis,pathVis);

                if(ans == true){
                    return false;
                }
            }
        }

        return true;
    }

    public boolean checkCycle(int node,ArrayList<ArrayList<Integer>> adj,int[] vis,int[] pathVis){
        vis[node] = 1;
        pathVis[node] = 1;

        for(int adjNode : adj.get(node)){
            if(vis[adjNode] == 0){
                boolean ans = checkCycle(adjNode,adj,vis,pathVis);

                if(ans == true){
                    return true;
                }
            }
            else if (pathVis[adjNode] == 1){
                return true;
            }
        }
        pathVis[node] = 0;
        return false;
    }
}