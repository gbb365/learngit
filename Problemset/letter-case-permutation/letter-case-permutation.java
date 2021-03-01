
// @Title: 字母大小写全排列 (Letter Case Permutation)
// @Author: 15218859676
// @Date: 2020-12-15 22:13:32
// @Runtime: 8 ms
// @Memory: 39.6 MB

class Solution {
    private List<String> res;
    public List<String> letterCasePermutation(String S) {
        res = new ArrayList<String>();
        int len = S.length();
        if(len <= 0 ){
            return res;
        }
        //全部转成小写
        String strs = S.toLowerCase();
        char[] arr = strs.toCharArray();
        //使用String，每次都生成新的字符串对象，不用撤销状态
        dfs(arr, 0 , "");
        return res;
    }
    public void dfs(char[] arr, int index, String str){
        if(index == arr.length){
            res.add(str);
            return;
        }
            char c = arr[index];
            dfs(arr, index + 1, str + c );
            if(Character.isLetter(c)){
                dfs(arr, index + 1, str + (char)(c - 32));
            }
        
    }
}
