class MinStack {
    private Stack<Integer> st;
    private Stack<Integer> minstack;
    public MinStack() {
        st = new Stack<>();
        minstack = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if(minstack.isEmpty() || val <= minstack.peek()){
            minstack.push(val);
        }
    }
    
    public void pop() {
        if (st.peek().equals(minstack.peek())) {
            minstack.pop();
        }
        st.pop();
    }
    
    public int top() {
           return st.peek();
    }
    
    public int getMin() {
        if(minstack.isEmpty())
        return 0;
        return minstack.peek();
    }
}