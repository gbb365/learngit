
// @Title: 杨辉三角 (Pascal's Triangle)
// @Author: 15218859676
// @Date: 2020-12-13 23:26:27
// @Runtime: 1 ms
// @Memory: 36.7 MB

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList();
        if(numRows < 1){
            return res;
        }
        ArrayList list1 = new ArrayList();
        list1.add(1);
        res.add(list1);
        for(int i = 1 ; i < numRows; i++){
            List<Integer> temp = res.get(i - 1);
            List<Integer> list = new ArrayList();
            list.add(1);
            for(int j = 1 ; j < i ;j++){
                list.add(temp.get(j - 1)+ temp.get(j));
            }
            list.add(1);
            res.add(list);
        }
        return res;
    }
}
