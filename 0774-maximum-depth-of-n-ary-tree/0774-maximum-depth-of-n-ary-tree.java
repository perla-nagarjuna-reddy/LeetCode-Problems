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
    public int maxDepth(Node root) {
        return levelOrder(root).size();

    }
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();

        if(root == null) return ans;

        Queue<Node> q = new LinkedList<>();

        q.offer(root);
        List<Integer> list = new ArrayList<>();
        list.add(root.val);
        ans.add(list);
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
                ans.add(temp);
            }
        }

        return ans;
    }
}