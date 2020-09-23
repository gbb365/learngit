
// @Title: 栈的最小值 (Min Stack LCCI)
// @Author: 15218859676
// @Date: 2020-09-23 20:01:32
// @Runtime: 19 ms
// @Memory: 40.5 MB

class MinStack {
    Stack<Integer> stack;
    Stack<Integer> temp;
    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<Integer>();
        temp = new Stack<Integer>();
    }
    
    public void push(int x) {
        stack.push(x);
        if(temp.isEmpty()|| x<=temp.peek()){
            temp.push(x);
        }
    }
    
    public void pop() {
        int top = stack.pop();
        if(top == temp.peek()){
            temp.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return temp.peek();
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
