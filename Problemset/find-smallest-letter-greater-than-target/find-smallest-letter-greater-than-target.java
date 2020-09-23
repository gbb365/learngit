
// @Title: 寻找比目标字母大的最小字母 (Find Smallest Letter Greater Than Target)
// @Author: 15218859676
// @Date: 2020-09-19 16:34:34
// @Runtime: 0 ms
// @Memory: 39.3 MB

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        //
        int i = 0,j = letters.length-1;
        while(i<=j){
            int mid = i+(j-i)/2;
            if(letters[mid]<= target){
                i = mid+1;
            }else{
                j = mid - 1;
            }
        }
        return i < letters.length? letters[i]:letters[0];
    }
}
