
// @Title: Z 字形变换 (ZigZag Conversion)
// @Author: 15218859676
// @Date: 2020-12-12 21:38:48
// @Runtime: 13 ms
// @Memory: 39 MB

class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1 ){
            return s;
        }
        int len = Math.min(s.length(),numRows);
        String[] rows = new String[len];
        for(int i = 0 ; i < rows.length; i++){
            rows[i] = "";
        }
        int loc = 0;
        boolean down = false;
        for(int i = 0 ; i < s.length(); i++){
            rows[loc] += s.substring(i, i + 1);
            if(loc == 0 || loc == numRows - 1){
                down = !down;
            }
            loc += down ? 1:-1;
        }
        String res = "";
        for(String row : rows){
            res += row;
        }
        return res;
    }
}
