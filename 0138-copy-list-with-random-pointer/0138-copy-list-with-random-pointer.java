/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node temp = head;

        // creating copynode in between nodes
        while(temp != null){
            Node copyNode = new Node(temp.val);
            copyNode.next = temp.next;
            temp.next = copyNode;
            temp = temp.next.next;
        }

        //creating random pointer for copynodes
        temp = head;

        while(temp != null){
            Node copyNode = temp.next;
            if(temp.random != null) copyNode.random = temp.random.next;
            else{
                copyNode.random = null;
            }
            temp = temp.next.next;
        }

        // creating next pointer for copynodes;

        Node dummy = new Node(-1);
        Node mover = dummy;
        temp =head;
        while(temp != null){
            mover.next = temp.next;
            temp.next = temp.next.next;
            mover = mover.next;
            temp = temp.next;
        }

        return dummy.next;
    }
}