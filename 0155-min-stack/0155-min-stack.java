	class MinStack {

		private Deque<Integer> inputStack;
		private Deque<Integer> minStack;

		public MinStack() {
			inputStack = new LinkedList<Integer>();
			minStack = new LinkedList<Integer>();
		}

		public void push(int val) {

			inputStack.push(val);
			//equal operator includes duplicates and eliminates edge case with this approach
			if(minStack.isEmpty() || minStack.peek() >= val) minStack.push(val);
		}

		public void pop() {
			int currentPoped = inputStack.pop();
			if(currentPoped == minStack.peek()) minStack.pop();
		}

		public int top() {
			return inputStack.peek();
		}

		public int getMin() {
			return minStack.peek();
		}
	}
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */