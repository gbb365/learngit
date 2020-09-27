
// @Title: 队列的最大值 (队列的最大值 LCOF)
// @Author: 15218859676
// @Date: 2020-09-27 11:14:54
// @Runtime: 37 ms
// @Memory: 46.9 MB

class MaxQueue {
    /*
    需要在O(1)时间获得最大值，用一个辅助栈保存最大值。类似于最小栈
    典型的错误，用最小栈的方法是不行的。因为你的队头元素出队后，有可能你的这个队头元素还压在栈底。
    这就造成了，明明队中没有这个元素了，但是getMax的时候，出来的又是这个元素
    */
    private Deque<Integer> queue;
    private Deque<Integer> help;
    public MaxQueue() {
        queue = new ArrayDeque<>();
        help = new ArrayDeque<>();
    }
    public int max_value() {
        return queue.isEmpty()?-1:help.peek();
    }
    
    public void push_back(int value) {
        queue.offer(value);
        while(!help.isEmpty()&&value>help.peekLast()){
            help.pollLast();
        }
        help.offer(value);
    }
    
    public int pop_front() {
        if(queue.isEmpty()){
            return -1;
        }
        int front = queue.pop();
        if(help.peek() ==front){
            help.pop();
        }
        return front;
    }
}

/**
 * Your MaxQueue object will be instantiated and called as such:
 * MaxQueue obj = new MaxQueue();
 * int param_1 = obj.max_value();
 * obj.push_back(value);
 * int param_3 = obj.pop_front();
 */
