class ListNode{

    int val;

    ListNode next;

    public ListNode(){
    }

    public ListNode(int val){
        this.val = val;
        this.next = null;
    }

    public ListNode(int val,ListNode next){
        this.val = val;
        this.next = next;
    }
}
class MyLinkedList {
    int size;
    ListNode head;
    public MyLinkedList() {
        head = null;
        size = 0;
    }
    
    public int get(int index) {

        int count = 0;

        if(index == 0){
            if(head != null){
                return head.val;
            }
        }

        ListNode temp = head;

        while(temp != null){

            if(count == index){
                return temp.val;
            }
            count++;
            temp = temp.next;
        }
        return -1; 
    }
    
    public void addAtHead(int val) {

        if(head == null){
            head = new ListNode(val);
            return;
        }

        ListNode temp = new ListNode(val);

        temp.next = head;

        head = temp;

    }
    
    public void addAtTail(int val) {

        if (head == null) {
            head = new ListNode(val);
            return;
        }
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new ListNode(val);
    }
    
    public void addAtIndex(int index, int val) {

        size = getSize(head);

        if(index >= size) return;

        int count = 0;

        if(head == null){
            head = new ListNode(val);
            return;
        }

        if(index == 0){

            ListNode temp = new ListNode(val);

            temp.next = head;

            head = temp;

            return;
        }

        ListNode temp = head,prev=null ;

        int cnt = 0;

        while(temp != null){
            if(cnt == index){
                ListNode newNode = new ListNode(val);
                newNode.next = temp;
                prev.next = newNode;
                return;
            }
            cnt++;
            prev = temp;
            temp = temp.next;
        }
        if (cnt == index) {
            prev.next = new ListNode(val);
        }
    }
    
    public void deleteAtIndex(int index) {

        size = getSize(head);

        if(index > size) return;

        if (index == 0) {
            if (head != null) {
                head = head.next;
            }
            return;
        }

        ListNode temp = head;
        ListNode prev = null;
        int count = 0;

        while (temp != null) {
            if (count == index) {
                break;
            }
            count++;
            prev = temp;
            temp = temp.next;
        }

        if (temp != null && prev != null) {
            prev.next = temp.next;
        }
    }

    public int getSize(ListNode head){
        ListNode temp = head;
        int cnt = 1;

        while(temp != null){
            cnt++;
            temp = temp.next;
        }

        return cnt;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.dvalteAtIndex(index);
 */