
// @Title: 罗马数字转整数 (Roman to Integer)
// @Author: 15218859676
// @Date: 2020-09-26 16:14:55
// @Runtime: 4 ms
// @Memory: 38.7 MB

class Solution {
    public int romanToInt(String s) {
        //遍历字符串，如果preNum比num小，则sum-=preNum，否则sum+=preNum，最后一个要直接加上。
        int sum = 0;
        
        int preNum = getValue(s.charAt(0));
        for(int i=1;i<s.length();i++){
            int num = getValue(s.charAt(i));
            if(preNum<num){
                sum-=preNum;
            }else{
                sum+=preNum;
            }
            preNum = num;
        }
        sum+=preNum;
        return sum;

    }
    private int getValue(char ch) {
        switch(ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
