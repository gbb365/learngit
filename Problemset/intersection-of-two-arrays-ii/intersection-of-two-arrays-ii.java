
// @Title: 两个数组的交集 II (Intersection of Two Arrays II)
// @Author: 15218859676
// @Date: 2020-10-21 21:19:48
// @Runtime: 4 ms
// @Memory: 38.7 MB

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        //方法二.使用map来统计nums1中出现的次数，然后遍历nums2，找出重复的元素
        if(nums1.length > nums2.length){
            return intersect(nums2,nums1);
        }
        Map<Integer,Integer> map = new HashMap<>();
        for(Integer num:nums1){
            int count = map.getOrDefault(num,0)+1;
            map.put(num,count);
        }
        int index = 0;
        int[] intersection = new int[nums1.length];
        for(Integer num : nums2){
            int count = map.getOrDefault(num,0);
            if(count>0){
                intersection[index++] = num;
                count--;
                if(count>0){
                    map.put(num,count);
                }else{
                    map.remove(num);
                }
            }
        }
        return Arrays.copyOfRange(intersection,0,index);




        /**
            对两个数组进行排序，用两个指针从头分别开始遍历，如果相等就
            添加到新的数组中
        */
        /**
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int len1 = nums1.length;
        int len2 = nums2.length;
        int[] intersect = new int[Math.min(len1,len2)];
        int index1 = 0 ;
        int index2 = 0 ;
        int index = 0 ;
        while(index1 < len1 && index2 < len2){
            if(nums1[index1]<nums2[index2]){
                index1++;
            }else if(nums1[index1]>nums2[index2]){
                index2++;
            }else{
                intersect[index] = nums1[index1];
                index1++;
                index2++;
                index++;
            }
        }
        return Arrays.copyOfRange(intersect, 0, index);
        */
        



    }
}
