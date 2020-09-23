
// @Title: 化栈为队 (Implement Queue using Stacks LCCI)
// @Author: 15218859676
// @Date: 2020-09-22 17:17:00
// @Runtime: 13 ms
// @Memory: 36.4 MB

class MyQueue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;
    /** Initialize your data structure here. */
    public MyQueue() {
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        stack1.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(!stack2.isEmpty()){
            return stack2.pop();
        }
        else{
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        }
    }
    
    /** Get the front element. */
    public int peek() {
        if(!stack2.isEmpty()){
           return stack2.peek();
        }
        else{
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
             return stack2.peek();
        }
       
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack1.isEmpty()&&stack2.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
