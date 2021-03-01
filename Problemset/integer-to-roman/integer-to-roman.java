
// @Title: 整数转罗马数字 (Integer to Roman)
// @Author: 15218859676
// @Date: 2020-12-12 22:22:10
// @Runtime: 4 ms
// @Memory: 37.9 MB


class Solution {
    public String intToRoman(int num) {
        int []nums = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        StringBuilder res = new StringBuilder();
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        for(int i = 0 ; i < nums.length ; i++){
            while (num >= nums[i]){
                res.append(romans[i]);
                num -= nums[i];
            }
        }
        return res.toString();
    }
}

