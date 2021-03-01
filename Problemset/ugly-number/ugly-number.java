
// @Title: 丑数 (Ugly Number)
// @Author: 15218859676
// @Date: 2021-01-12 21:00:40
// @Runtime: 1 ms
// @Memory: 35.6 MB

class Solution {
    public boolean isUgly(int num) {
        if(num <= 0){
            return false;
        }
        if(num == 1){
            return true;
        }
        while(num % 2 == 0){
            num /= 2;
        }
        while( num % 3 == 0){
            num /= 3;
        }
        while( num % 5 == 0){
            num /= 5;
        }
        return num == 1;
    }
}
