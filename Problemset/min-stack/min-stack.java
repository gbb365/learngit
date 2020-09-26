
// @Title: 最小栈 (Min Stack)
// @Author: 15218859676
// @Date: 2020-09-25 10:45:05
// @Runtime: 6 ms
// @Memory: 40.5 MB

class MinStack {
    Stack<Integer> stack;
    Stack<Integer> help;
    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<Integer>();
        help = new Stack<Integer>();
    }
    
    public void push(int x) { 
        stack.push(x);
        if(help.isEmpty()||x<=help.peek()){
            help.push(x);
        }
    }
    
    public void pop() {
        int x = stack.pop();
        if(x == help.peek()){
            help.pop();
        }
    }
    
    public int top() {
       return stack.peek();
    }
    
    public int getMin() {
        return help.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
