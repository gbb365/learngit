
// @Title: 猜数字大小 (Guess Number Higher or Lower)
// @Author: 15218859676
// @Date: 2020-11-04 12:16:59
// @Runtime: 0 ms
// @Memory: 35.4 MB

/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        //返回猜中的数字
        /**
            guess()有三种返回值
            -1：pick<num
             1: pick>num
             0: pick== num
        */
        
        int left = 1 ;
        int right = n;
        while(left <= right){
            //使用 mid=(left + right)/2会超时的，为什么？因为超出了int的范围，注意规范
            int mid = left + (right - left +1) /2 ;
            //这里的写的也不符合规范。if里面尽量不要调用逻辑。把guess提取出来，调用一次就够了
            if(guess(mid) == 0 ){
                return mid;
            }else if (guess(mid) == -1){
                right = mid - 1;
            }else if(guess(mid)==1){
                left = mid+1;
            }
        }
        return right;
    }
}
