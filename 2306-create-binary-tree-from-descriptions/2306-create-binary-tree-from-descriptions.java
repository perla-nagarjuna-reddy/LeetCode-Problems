/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode createBinaryTree(int[][] descriptions) {
        HashMap<Integer,ArrayList<Integer[]>> map = new HashMap<>();

        Set<Integer> child = new HashSet<>();

        Map<Integer, TreeNode> nodeMap = new HashMap<>();

        for(int i = 0 ; i < descriptions.length; i++){

            int[] arr = descriptions[i];

            child.add(arr[1]);
            if(map.containsKey(arr[0])){

                ArrayList<Integer[]> temp = map.get(arr[0]);
                
                temp.add(new Integer[]{arr[1],arr[2]});

                map.put(arr[0],temp);
            }
            else{
                ArrayList<Integer[]> temp = new ArrayList<>();

                temp.add(new Integer[]{arr[1],arr[2]});

                map.put(arr[0],temp);
            }
        } 

        int rootNode = 0;

        for(int val : map.keySet()){

            if(!child.contains(val)){
                rootNode = val;
                break;
            }
        }

        for (int key : map.keySet()) {
            nodeMap.putIfAbsent(key, new TreeNode(key));
            for (Integer[] pair : map.get(key)) {
                int childVal = pair[0];
                int isLeft = pair[1];

                nodeMap.putIfAbsent(childVal, new TreeNode(childVal));

                if (isLeft == 1) {
                    nodeMap.get(key).left = nodeMap.get(childVal);
                } else {
                    nodeMap.get(key).right = nodeMap.get(childVal);
                }
            }
        }
        return nodeMap.get(rootNode);
    }
}