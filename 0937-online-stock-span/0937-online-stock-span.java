class Pair{
    int val;
    int ind;

    Pair(int val,int ind){
        this.val = val;
        this.ind = ind;
    }
}

class StockSpanner {
    Stack<Pair> st;
    int index = 0;
    public StockSpanner() {
        st = new Stack<>();
    }
    
    public int next(int price) {
        
        while(!st.isEmpty() && st.peek().val <= price){
            st.pop();
        }
        int ans = st.isEmpty()?index+1:index-st.peek().ind;
        Pair pair = new Pair(price,index);
        index++;
        st.push(pair);
        return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */