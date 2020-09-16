
// @Title: 用两个栈实现队列 (用两个栈实现队列 LCOF)
// @Author: 15218859676
// @Date: 2020-09-16 10:37:45
// @Runtime: 56 ms
// @Memory: 46.8 MB

class CQueue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public CQueue() {
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }
    
    public void appendTail(int value) {
        stack1.push(value);
    }
    
    public int deleteHead() {
        if(stack2.isEmpty()){
            if(stack1.isEmpty()) return -1;//队列中没有元素，直接返回-1
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        }else{
            return stack2.pop();
        }
        
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */
