
// @Title: 有效的括号 (Valid Parentheses)
// @Author: 15218859676
// @Date: 2020-09-16 09:13:27
// @Runtime: 1 ms
// @Memory: 36.6 MB

class Solution {
    public boolean isValid(String s) {
        // 方法1. 使用辅助栈，逐个读取字符串将左括号对应的右括号读入栈中，在条件最后会有对应出栈的。
        //返回栈是否为空
        Stack<Character> stack = new Stack<Character>();
        for(char ss : s.toCharArray()){
            if(ss == '('){
                stack.push(')');
            }else if(ss == '['){
                stack.push(']');
            }else if(ss=='{'){
                stack.push('}');
            }else if(stack.isEmpty() || ss!=stack.pop()){
                return  false;
            }
        }
        return stack.isEmpty();
    }
}
