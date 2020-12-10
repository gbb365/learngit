
// @Title: 电话号码的字母组合 (Letter Combinations of a Phone Number)
// @Author: 15218859676
// @Date: 2020-12-09 22:23:52
// @Runtime: 6 ms
// @Memory: 38.7 MB

class Solution {
    private String letterMap[] = {
                  " ",    //0
                  "",     //1
                  "abc",  //2
                  "def",  //3
                  "ghi",  //4
                  "jkl",  //5
                  "mno",  //6
                  "pqrs", //7
                  "tuv",  //8
                  "wxyz"  //9
          };
    private List<String> res;
    public List<String> letterCombinations(String digits) {
        res  = new ArrayList<String>();
        if(digits.equals("")){
            return res;
        }
        getCombinations(digits, 0, "");
        return res;
    }

    public void getCombinations(String digits, int index, String s){
        if(index == digits.length()){
            res.add(s);
            return;
        }
       
        Character c = digits.charAt(index);
        String letter = letterMap[c - '0'];
        for(int i = 0 ; i < letter.length(); i++){
            getCombinations(digits, index + 1, s + letter.charAt(i));
        }
    }
}
