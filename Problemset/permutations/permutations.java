
// @Title: 全排列 (Permutations)
// @Author: 15218859676
// @Date: 2020-12-10 19:59:59
// @Runtime: 2 ms
// @Memory: 38.4 MB

class Solution {
    private List<List<Integer>> res;
    private boolean[] visit;
    private ArrayList<Integer> list;
    public List<List<Integer>> permute(int[] nums) {
        
        int len = nums.length;
        visit = new boolean[len];
        res = new ArrayList<>();
        list = new ArrayList<Integer>();
        if(nums == null || len == 0){
            return res;
        }
        findPernute(nums,0,list);
        return res;
    }
    public void findPernute(int[]nums, int index, ArrayList<Integer> list){
        if(index == nums.length){
            res.add(new ArrayList(list));
            return ;
        }
        for(int i = 0 ; i < nums.length ; i++){
            if(!visit[i]){
                list.add(nums[i]);
                visit[i] = true;
                findPernute(nums, index + 1, list);
                list.remove(list.size() - 1);
                visit[i] = false;
            }
        }
    }
}
