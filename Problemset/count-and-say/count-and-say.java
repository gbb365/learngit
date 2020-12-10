
// @Title: 外观数列 (Count and Say)
// @Author: 15218859676
// @Date: 2020-12-08 18:25:26
// @Runtime: 10 ms
// @Memory: 37.9 MB


class Solution {
    public String countAndSay(int n) {
        //pre存当前的上一个的结果串
        StringBuilder pre;
        //cur是每次计算的新串，每次结束后要把cur给pre，开始下一次的计算
        StringBuilder cur = new StringBuilder("1");
        for(int i = 1 ; i < n ; i++){
            pre = cur;
            cur = new StringBuilder();
            int end = 0 ;
            int start = 0;
            //遍历一次pre串计算当前的串
            while (end < pre.length()){
                //这里再次判断了一次end < pre.length()，防止内循环中end++越界
                while (end < pre.length() && pre.charAt(start) == pre.charAt(end)){
                    end++;
                }
                cur.append(Integer.valueOf(end - start)).append(pre.charAt(start));
                start = end;
            }
        }
        return cur.toString();
    }

}

