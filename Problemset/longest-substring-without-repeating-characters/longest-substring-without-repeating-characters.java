
// @Title: 无重复字符的最长子串 (Longest Substring Without Repeating Characters)
// @Author: 15218859676
// @Date: 2020-09-25 14:39:33
// @Runtime: 8 ms
// @Memory: 39.1 MB

class Solution {
    //暴力法，使用两层循环遍历每一个子串。遍历的过程中添加到set，更新最长子串的长度
    //时间复杂度过高，无法通过
    public int lengthOfLongestSubstring(String s) {
    //     int n = s.length();
    //     int result = 0 ;
    //     for( int i = 0 ;i < n;i++){
    //         for( int j = i+1;j<=n;j++){
    //             if(notrep(s,i,j)){
    //                 result = Math.max(result,j-i);
    //             }
    //         }
    //     }
    //     return result;
    // }
    // public boolean notrep(String s,int start ,int end){
    //     Set<Character> set = new HashSet<Character>();
    //     for(int i = start;i<end;i++){
    //         char c = s.charAt(i);
    //         if(set.contains(c)) return false;
    //         set.add(c);
    //     }
    //     return true;
    // }
    
    //上面的暴力法做了很多重复的判断。[0,1),[0,2)...[0,3)不需要重头开始判断，只需要判断str[2]是否在
    //[0,2)中，在了就证明有重复，后面的[0,4),[0,5)都不用判断了。直接i+1，j不动
    //判断一个字符串是否重复可以直接遍历，O(n),也可以使用hash，O(1)
    // int i = 0 , j = 0,result = 0;
    // int n = s.length();
    // Set<Character> set = new HashSet<Character>();
    // while(i<n && j < n){
    //     if(!set.contains(s.charAt(j))){
    //         set.add(s.charAt(j++));
    //         result = Math.max(result,j - i);//因为j在上面已经+1了，所以算长度不用再+1
    //     }else{
    //         set.remove(s.charAt(i++));
    //     }
    // }
    // return result;

    //方法2 的改进，移动i的时候可以直接跳过子串里面重复的下标为j的字符
    int ans = 0;
    int n = s.length();
    HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i =0,j = 0;j<n;j++){
            if(map.containsKey(s.charAt(j))){
                i = Math.max(map.get(s.charAt(j)),i);//之所以用max是为了确保不跳到i前面的
            }
            ans = Math.max(ans,j-i+1);//更新子串的长度
            map.put(s.charAt(j),j+1);//储存i下一步跳跃到的位置
        }
        return ans;
    }
}
