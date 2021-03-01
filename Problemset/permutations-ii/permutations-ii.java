
// @Title: 全排列 II (Permutations II)
// @Author: 15218859676
// @Date: 2020-12-10 21:41:37
// @Runtime: 1 ms
// @Memory: 39.1 MB

class Solution {
    private List<List<Integer>> res;
    private ArrayList<Integer> list;
    private boolean[] visit;
    // private Set<List<Integer>> set = new HashSet<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        //全排列,给出的数组含有重复的数字,返回所有不重复的全排列
        //如何跳过重复的数字,用一个set去重,最后再添加到List中
        int len = nums.length;
        res = new ArrayList<>();
        visit = new boolean[len];
        list = new ArrayList<Integer>();
        if(nums == null || len == 0 ){
            return res;
        }
        Arrays.sort(nums);
        findPermuteUnique(nums,0,list);
        // res = new ArrayList<>(set);
        return res;
    }
    public void findPermuteUnique(int[] nums, int index, ArrayList<Integer> list){
        if(index == nums.length){
            // set.add(new ArrayList(list));
            res.add(new ArrayList(list));
            return ;
        }
        for(int i = 0 ; i < nums.length; i++){
            
            if(!visit[i]){
                if(i > 0 && nums[i] == nums[i - 1] && visit[i - 1] == false){
                   continue;
                }
                 list.add(nums[i]);
                    visit[i] = true;
                    findPermuteUnique(nums, index + 1, list);
                    list.remove(list.size()-1);
                    visit[i] = false;
            }
        }
    }
}
