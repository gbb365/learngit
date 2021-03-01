
// @Title: 复原 IP 地址 (Restore IP Addresses)
// @Author: 15218859676
// @Date: 2020-12-21 22:10:05
// @Runtime: 6 ms
// @Memory: 38.6 MB

class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        int len = s.length();
        if(len < 4 || len > 12){
            return res;
        }
        int split = 0 ;
        Deque<String> path = new ArrayDeque<>(4);
        dfs(s, len, split, 0, path, res);
        return res;
    }
    public int isValid(String s, int left, int right){
        int len = right - left + 1;
        if( len > 1 && s.charAt(left) == '0'){
            return -1;
        }
        int num = 0;
        for(int i = left ; i <= right; i++){
            num = num * 10 + s.charAt(i) - '0';
        }
        if(num > 255){
            return -1;
        }
        return num;
    }
    public void dfs(String s, int len, int split, int begin, Deque<String> path, List<String> res){
        if(begin == len){
            if(split == 4){
                res.add(String.join(".",path));
            }
            return;
        }
        if((len - begin) < (4 - split) || (len - begin) > 3 * (4 - split)){
            return;
        }
        for(int i = 0 ; i < 3 ; i++){
            if(begin + i >= len){
                break;
            }
            //循环找错了
            //int ipSegment = isValid(s, begin, begin + 1);
            int ipSegment = isValid(s, begin, begin + i);
            if(ipSegment != -1){
                path.addLast(ipSegment + "");
                dfs(s, len, split + 1, begin + i + 1, path, res);
                path.removeLast();
            }
        }
    }
}
