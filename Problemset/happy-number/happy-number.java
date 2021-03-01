
// @Title: 快乐数 (Happy Number)
// @Author: 15218859676
// @Date: 2021-01-11 22:16:19
// @Runtime: 1 ms
// @Memory: 35.1 MB

class Solution {
    public int getNext(int n){
        int temp = 0;
        while(n > 0){
            temp += Math.pow(n % 10, 2);
            n /= 10;
        }
        return temp;
    }
    public boolean isHappy(int n) {
        //判断是否是快乐数
        //快乐数：每次将整数替换成每个位置上的平方和，重复，最后变成1就是快乐数
        
        //使用快慢指针
        int slow = n;
        int fast = getNext(n);
        while(fast != 1 && slow != fast){
            slow = getNext(slow);
            //速度差
            fast = getNext(getNext(fast));
        }
        return fast == 1;




        //计算完一次就存到map，如果下次还出现了这个就说明进入死循环，直接退出
        // Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        // while( n != 1){
        //     int temp = 0;
        //     //数位分离，求平方和
        //     while( n > 0){
        //         temp += Math.pow(n % 10, 2);
        //         n /= 10;
        //     }
        //     if(map.containsKey(temp)){
        //         return false;
        //     }
        //     map.put(temp, 1);
        //     n = temp;
        // }
        // return true;
    }
}
