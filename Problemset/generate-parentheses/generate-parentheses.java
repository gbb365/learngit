
// @Title: 括号生成 (Generate Parentheses)
// @Author: 15218859676
// @Date: 2020-12-15 21:31:43
// @Runtime: 1 ms
// @Memory: 38.7 MB

class Solution {
    private List<String> res; 
    public List<String> generateParenthesis(int n) {
        /**
            括号生成：生成所有可能的并且有效的括号组合，n代表生成括号的对数
        */
        //减肥
        res = new ArrayList();
        if( n <= 0 ){
            return res;
        }
        dfs(n,n,"");
        return res;
    }
    public void dfs(int left, int right, String str){
        if(left == 0 && right == 0){
            res.add(str);
            return;
        }
        if(left > right){
            return;
        }
        if(left > 0){
            dfs(left - 1, right, str + "(");
        }
        if(right > 0){
            dfs(left, right - 1, str + ")");
        }
    }
}
