
// @Title: 三数之和 (3Sum)
// @Author: 15218859676
// @Date: 2020-10-20 17:11:53
// @Runtime: 23 ms
// @Memory: 42.3 MB

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        /**
            返回三个和为0的元素的元组，要求是不能重复
            参考解法：
            排序，取nums[i],然后用左右指着指向nums[i]两端，
            计算三数之和是否等0，满足就添加到结果集
            1. nums[i]>0,后面的和不可能为0，退出循环
            2. nums[i]==nums[i-1],重复，无需比较，跳过
            3. sum=0时，若nums[L]==nums[L+1]，重复，跳过
            4. sum=0时，若nums[R]==nums[R-1],重复，跳过
        */
        List<List<Integer>> res = new ArrayList();
        int len = nums.length;
        if(nums == null || len < 3){
            return res;
        }
        Arrays.sort(nums);//排序
        for(int i = 0 ; i < len; i++){
            if(nums[i]>0) break;//升序的，后面不可能有和为0的结果
            if(i>0 && nums[i] == nums[i-1]) continue;//跳过相同的nums[i]
            int L = i+1 ;//规定好nums[i],指定两个指针
            int R = len - 1;
            while(L<R){
                int sum = nums[i]+nums[L]+nums[R];
                if(sum == 0){//命中
                    res.add(Arrays.asList(nums[i],nums[L],nums[R]));//得到一组结果
                    while(L<R && nums[L]==nums[L+1]) L++;//相同跳过
                    while(L<R && nums[R]==nums[R-1]) R--;//跳过
                    L++;//上面指针变了，nums[i]没动，相应的L、R也要跳（排序了的）
                    R--;
                }
                else if(sum<0) L++;
                else if(sum>0) R--;
                }
            }
            return res;
        }
    }
