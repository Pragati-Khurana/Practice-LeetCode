class MinStack {
    Stack<Integer> s1;
    Stack<Integer> minS;
    public MinStack() {
        s1 = new Stack<>();
        minS = new Stack<>();
    }
    
    public void push(int val) {
        s1.push(val);
        if(minS.empty())
            minS.push(val);
        else {
            int min = minS.peek();
            if(val <= min)
                minS.push(val);
        }
    }
    
    public void pop() {
        int temp1 = s1.peek();
        int temp2 = minS.peek();
        if(temp1==temp2) {
            s1.pop();
            minS.pop();
        } else {
            s1.pop();
        }
    }
    
    public int top() {
        return s1.peek();
    }
    
    public int getMin() {
        return minS.peek();
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