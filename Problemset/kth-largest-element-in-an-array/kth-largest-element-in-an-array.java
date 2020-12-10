
// @Title: 数组中的第K个最大元素 (Kth Largest Element in an Array)
// @Author: 15218859676
// @Date: 2020-11-28 22:51:56
// @Runtime: 6 ms
// @Memory: 38.9 MB

class Solution {
    private static Random random = new Random(System.currentTimeMillis());
    public int findKthLargest(int[] nums, int k) {
        //快排实现
        int len = nums.length;
        int left = 0;
        int right = len - 1;
        int target = len - k;
        while(true){
            int index = partition2(nums, left, right);
            if(target == index){
                return nums[index];
            }else if(index > target){
                right = index - 1;
            }else {
                left = index + 1;
            }
        }

    }
    public int partition(int[] nums, int left , int right){
        int pivot = nums[left];
        int lt = left;
        for( int i = left + 1 ; i <= right ; i++){
            if(nums[i] < pivot){
                lt++;
                swap(nums, i , lt);
            }
        }
        swap(nums, left, lt);
        return lt;
    }

    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public int partition2(int[] nums, int left ,int right){
        if(right > left ){
            int randomIndex = left + 1 + random.nextInt(right - left);
            swap(nums, left ,randomIndex);
        }
        int pivot = nums[left];
        int lt = left + 1;
        int gt = right;
        while(true){
            while(lt <= gt && nums[lt]< pivot){
                lt++;
            }
            while(lt <= gt && nums[gt]> pivot){
                gt--;
            }
            if(lt > gt){
                break;
            }
            swap(nums,lt ,gt);
            lt++;
            gt--;
        }
        swap(nums,left,gt);
        return gt;
    }
        //优先队列，大顶堆
        // PriorityQueue<Integer> queue = new PriorityQueue<>((o1,o2)->(o2-o1));
        // for(int i = 0 ; i < nums.length; i++){
        //     queue.add(nums[i]);
        // }
        // int i = 0; 
        // while(i < k-1){
        //     queue.poll();
        //     i++;
        // }
        // return queue.peek();
    // }
}
