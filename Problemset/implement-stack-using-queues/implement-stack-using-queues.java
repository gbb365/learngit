
// @Title: 用队列实现栈 (Implement Stack using Queues)
// @Author: 15218859676
// @Date: 2020-09-23 08:53:53
// @Runtime: 0 ms
// @Memory: 36.4 MB

class MyStack {
    //队列模拟栈只需要将队列中的最后一个元素出栈，其他的元素用一个临时队列保存，重新转移到原来的队列中。
    Queue<Integer> queue;
    /** Initialize your data structure here. */
    public MyStack() {
        queue = new LinkedList<Integer>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        queue.offer(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        Queue<Integer> temp = new LinkedList<Integer>();
        while(queue.size()>1){
            temp.offer(queue.poll());
        }
        int top = queue.poll();
        while(!temp.isEmpty()){
            queue.offer(temp.poll());
        }
        return top;
    }
    // top等同于pop(),只是队列中的最后一个元素需要加回到原来的位置
    /** Get the top element. */
    public int top() {
        Queue<Integer> temp = new LinkedList<Integer>();
        while(queue.size()>1){
            temp.offer(queue.poll());
        }
        int top = queue.poll();

        temp.offer(top);//将最后一个元素加到temp队列中原来的位置
        while(!temp.isEmpty()){//重新将元素放回queue
            queue.offer(temp.poll());
        }
        
        return top;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }
    // 改进.可以不适用temp，直接在队列前面出，后面进。到达最后一个就返回。适用size控制

    //解法2.针对push做优化，每次push一个元素就把前面的元素重新排到它的后面。最优解？
    /*public void push(int x ){
        queue.push(x);
        int size = queue.size();
        while(size>1){
            queue.push(queue.poll());//保证新添加进来的元素肯定在队列的开头处
            size--;
        }

    }
    */
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
