
// @Title: 加一 (Plus One)
// @Author: 15218859676
// @Date: 2020-10-07 23:00:20
// @Runtime: 0 ms
// @Memory: 37.4 MB

class Solution {
    public int[] plusOne(int[] digits) {

        // int sum = 0;
        // int m = digits.length;
        // for(int i = 0;i<digits.length;i++){
        //     sum+=digits[i]*Math.pow(10,m-1);
        //     m--;
        // }
        // sum+=1;
        // int[] res = new int[digits.length];
        // for(int i = res.length-1 ;i>=0;i--){
        //     res[i] = sum%10;
        //     sum = sum/10;
        // }
        // return res;
        for(int i = digits.length-1;i>=0;i--){
            if(digits[i]!=9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int []temp = new int[digits.length+1];
        temp[0] = 1;
        return temp;
    }
}
