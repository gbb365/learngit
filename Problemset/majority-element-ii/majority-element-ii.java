
// @Title: 求众数 II (Majority Element II)
// @Author: 15218859676
// @Date: 2020-10-09 21:36:50
// @Runtime: 2 ms
// @Memory: 42.8 MB

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        /*
        如果至多选一个代表，那他的票数至少要超过一半（⌊ 1/2 ⌋）的票数；

        如果至多选两个代表，那他们的票数至少要超过 ⌊ 1/3 ⌋ 的票数；

        如果至多选m个代表，那他们的票数至少要超过 ⌊ 1/(m+1) ⌋ 的票数

        */
        List<Integer> result = new ArrayList<>();
        if(nums == null||nums.length==0) return result;
        int cand1 = nums[0];
        int cand2 = nums[0];
        int count1 = 0;
        int count2 = 0;
        //投票阶段,获得两个候选人
        for(int num:nums){
            if(num == cand1){
                count1++;
                continue;
            }
            if(num == cand2){
                count2++;
                continue;
            }
            if(count1==0){
                cand1 = num;
                count1 = 1;
                continue;
            }
            if(count2 == 0){
                cand2 = num;
                count2= 1;
                continue;
            }
            count1--;
            count2--;
            
        }
            
            //得到两个候选人,检查是否符合条件
            count1 = 0;
            count2 = 0;
            for(int num:nums){
                if(num == cand1){
                    count1++;
                }else if(num==cand2){
                    count2++;
                }
            }
            if(count1>nums.length/3) result.add(cand1);
            if(count2>nums.length/3) result.add(cand2);

            return result;
    }
}
