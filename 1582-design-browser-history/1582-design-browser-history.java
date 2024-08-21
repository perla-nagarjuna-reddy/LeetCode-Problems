class Node{
    String data;
    Node next;
    Node prev;
    public Node(String data, Node next,Node prev){
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
    public Node(String data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
class BrowserHistory {
    Node currentPage;
    public BrowserHistory(String homepage) {
        currentPage = new Node(homepage);
    }
    
    public void visit(String url) {
        Node newNode = new Node(url);
        currentPage.next = newNode;
        newNode.prev = currentPage;
        currentPage = newNode;
    }
    
    public String back(int steps) {
        while(steps > 0){
            if(currentPage.prev != null){
                currentPage = currentPage.prev;
            }
            else{
                break;
            }

            steps--;
        }
        return currentPage.data;
    }
    
    public String forward(int steps) {
        while(steps > 0){
            if(currentPage.next != null){
                currentPage = currentPage.next;
            }
            else{
                break;
            }
            steps--;
        }
        return currentPage.data;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */