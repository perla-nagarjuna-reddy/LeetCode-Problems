/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    int count = 1;
    public int maxDepth(Node root) {
        if(root == null) return 0;
        levelOrder(root);
        return count;
    }
    public void levelOrder(Node root) {
        if(root == null) return;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> temp = new ArrayList<>();
            for(int i=0;i<size;i++){
                Node removed = q.poll();
                if(removed.children.size() != 0){
                    for(Node node : removed.children){
                        temp.add(node.val);
                    }
                }
                for(Node val : removed.children){
                        q.offer(val);
                }
            }
            if(temp.size() != 0){
                count++;
            }
        }
    }
}