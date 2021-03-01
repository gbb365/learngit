
// @Title: 移掉K位数字 (Remove K Digits)
// @Author: 15218859676
// @Date: 2021-01-11 14:56:40
// @Runtime: 9 ms
// @Memory: 38.2 MB

class Solution {
    public String removeKdigits(String num, int k) {
        int len = num.length();
        if(len == 0 || k > len){
            return "0";
        }
        Deque<Character> deque = new ArrayDeque<Character>();
        for(int i = 0 ; i < len; i ++){
            char digit = num.charAt(i);
            //弹出栈顶比当前大的，更新k
            while(!deque.isEmpty() && k > 0 && deque.peekLast() > digit ){
                k--;
                deque.pollLast();
            }
            //当前的更新到栈顶
            deque.addLast(digit);
        }
        //遍历完成，还剩下k个需要删除的，从末尾删除k个
        for(int i = 0 ; i < k ;i++){
            deque.pollLast();
        }
        StringBuilder sb = new StringBuilder();
        //前导0不能当作最后的数字
        boolean leadingZero = true;
        while(!deque.isEmpty()){
            char letter = deque.pollFirst();
            if(leadingZero && letter == '0'){
                continue;
            }
            //找到第一个不是0了，后面的0可以使用
            leadingZero = false;
            sb.append(letter);
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
