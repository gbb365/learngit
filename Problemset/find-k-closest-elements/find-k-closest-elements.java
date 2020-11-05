
// @Title: 找到 K 个最接近的元素 (Find K Closest Elements)
// @Author: 15218859676
// @Date: 2020-11-05 14:35:54
// @Runtime: 4 ms
// @Memory: 40.3 MB

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        /**
            找到k个与给出的x最接近的元素，返回的结果要按升序排好，两个数与x差值一样，优先取前面的
            要对k进行计数
            找到比x大的第一个数，两边开始扩张，怎么扩张
        */
        
        //方法2.二分法，转换成找最优区间的左边界
        //最优区间左边界的下标搜索范围是【0，size-k】
        int len = arr.length;
        int left = 0;
        //要取k个数字在数组中，那么左边界范围的最左边可以取到：0，左边界范围的最右边可以取到：数组长度-k；
        //当k等于数组长度，左边界自然从0开始，当x大于数组最大值，左边界从len+k开始，一直取到末尾
        int right = len - k;
        while( left < right){
            int mid = left + (right - left)/2;
            //尝试长度为k+1的连续子区间删除一个元素，从而定位左区间端点的值
            //计算左右边界和x的差值，寻找左边界的位置
            if(x - arr[mid] > arr[mid+k] - x){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        //退出循环，left==right，这个就是寻找的最左边界
        ArrayList<Integer> list = new ArrayList();
        for(int i = left;i < left+k;i++){
            list.add(arr[i]);
        }
        return list;

        //方1.双指针法  因为要返回的数组是连续的，所以可以用两端和x的差值比较，左小于等于右边的都右往左移
        /**
        int len = arr.length;
        int left = 0 ;
        int right = len - 1;
        int diff = len - k;
        while(diff > 0){
            if(x - arr[left]<= arr[right]-x){
                right--;
            }else{
                left++;
            }
            diff--;
        }
        ArrayList<Integer> list = new ArrayList();
        for(int i = left; i < left+k ;i++){
            list.add(arr[i]);
        }
        
        return list;
        */
        
    }
}
