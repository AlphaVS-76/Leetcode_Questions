class MinStack {
    Stack<Integer> st;
    Stack<Integer> minst;

    public MinStack() {
        this.st = new Stack<>();
        this.minst = new Stack<>();
    }
    
    public void push(int val) {
        if(minst.isEmpty() || minst.peek()>= val){
            minst.push(val);
        }

        st.push(val);
    }
    
    public void pop() {
        int rem = st.pop();

        if(rem == minst.peek() && !minst.isEmpty()){
            minst.pop();
        }
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minst.isEmpty() ? 0 : minst.peek();
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