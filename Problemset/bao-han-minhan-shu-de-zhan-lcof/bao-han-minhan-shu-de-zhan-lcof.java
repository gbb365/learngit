
// @Title: 包含min函数的栈 (包含min函数的栈 LCOF)
// @Author: 15218859676
// @Date: 2020-09-23 10:15:51
// @Runtime: 18 ms
// @Memory: 40.6 MB

class MinStack {
    //设置一个辅助栈，将最小的丢进去
    Stack<Integer> stack;
    Stack<Integer> temp;
    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<Integer>();
        temp = new Stack<Integer>();
    }
    
    public void push(int x) {
        stack.push(x);
        if(temp.isEmpty()||x<=temp.peek()){
            temp.push(x);
        }
    }
    
    public void pop() {
        int e = stack.pop();
        if(e == temp.peek()){
            temp.pop();//保证temp栈顶的元素是最小的
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int min() {
        return temp.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */
