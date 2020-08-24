
# @Title: 两数之和 (Two Sum)
# @Author: 15218859676
# @Date: 2020-08-13 10:35:06
# @Runtime: 44 ms
# @Memory: 13.9 MB

class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        hsmap = {}
        for i in range(len(nums)):
            obj = target - nums[i]
            # if hsmap.has_key(obj):
            if obj in hsmap:
                return [hsmap.get(obj),i]
            else:
                # hsmap.update({nums[i]:i})
                hsmap[nums[i]] = i
        return None
