
// @Title: 接雨水 (Trapping Rain Water)
// @Author: 15218859676
// @Date: 2020-11-07 16:39:53
// @Runtime: 1 ms
// @Memory: 38.1 MB

class Solution {

    //找到当前位置两端的最大高度
    public int max(int[]height,int left, int right){
        int max = height[left];
        for(int i = left+1; i <= right;i++){
            max = Math.max(max,height[i]);
        }
        return max;
    }

    public int trap(int[] height) {

        //方法3.指针对撞。和暴力法相似，但是不用从头遍历，分别从左右两便开始，不断跟更新最大值。
        int len = height.length;
        if(len < 3){
            return 0;
        }
        int leftHeight = height[0];
        int rightHeight = height[len-1];
        int left = 1;
        int right = len-2;
        int res = 0;
        while(left <= right){
            int min = Math.min(leftHeight,rightHeight);
            if(leftHeight ==  min){
                if(min>height[left]){
                    res+= min-height[left];
                }
                //更新最高高度。其实直接更新为height[left]就行
                leftHeight = Math.max(leftHeight,height[left]);
                left++;
            }else {
                if(min>height[right]){
                    res += min-height[right];
                }

                rightHeight = Math.max(rightHeight,height[right]);
                right--;
            }
        }
        return res;
        /**

        方法2：动态规划改进：
        暴力法在遍历数组的时候重复计算了很多次最大高度。可以用可以数组缓存当前位置的最大高度。
        状态数组：
        leftheighst[i]:数组在【0,i-1】的最大值
        rightheighst[i]:数组在【i+1，len-1】的最大值
        转移方程：
        只需要取当前的和前一个heightst作比较，取大的。
        leftheightst[i] = max(height[i-1],leftheightst[i-1])
        rightheightst[i] = max(height[i+1],rightheightst[i+1])
        
         */
         /**
         int len = height.length;
         if(len<3){
            return 0; 
         }
         int[] leftheightest = new int[len];
         //填充最高高度数组
         for(int i = 1 ; i < len -1 ; i++){
             leftheightest[i] = Math.max(height[i-1],leftheightest[i-1]);
         }
         int[] rightheighst = new int[len];
         for(int i = len-2 ; i > 0 ; i--){
             rightheighst[i] = Math.max(height[i+1],rightheighst[i+1]);
         }
        int res = 0;
         for(int i = 1 ; i < len - 1; i++){
            int min =  Math.min(leftheightest[i],rightheighst[i]);
            if(height[i]<min){
                res += min - height[i];
            }
         }
         return res;
         **/


    }







        /**
            给定了n个非负整数，每个宽度为1，计算所有柱子之间空隙能接多少雨水
            
        */
        /**暴力法：O(n)
           第一个和最后一个不存雨水，凹槽存水
           每个位置是的存水量和其左右两边最高的高度的较小者决定
           如果当前的高度大于前一步中的较小者，那么当前位置不能存水
        
        int res = 0;
        int len = height.length;
        for(int i = 1 ; i < len-1;i++){
            int leftHeight= max(height,0,i-1);
            int rightHeight = max(height,i+1,len-1);
            
            int curHeight = Math.min(leftHeight,rightHeight);
            if(curHeight>height[i]){
                res += curHeight - height[i];
            }
        }
        return res;
    }
    */
    


}
