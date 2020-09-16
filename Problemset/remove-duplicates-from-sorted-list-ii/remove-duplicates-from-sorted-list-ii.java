
// @Title: 删除排序链表中的重复元素 II (Remove Duplicates from Sorted List II)
// @Author: 15218859676
// @Date: 2020-08-25 16:04:33
// @Runtime: 6 ms
// @Memory: 38.7 MB

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        //方法1.使用额外的一个map,遍历链表，将不重复的节点存到map中
        // 用map中的元素来新建一个链表返回。注意遍历时，节点指针的跳过位置
        if(head == null || head.next == null){
            return head;
        }
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(head != null ){
            if(map.containsKey(head.val)){
                map.put(head.val,map.get(head.val)+1);
            }else{
                map.put(head.val,1);
            }
            head =head.next;
        }
        for(Integer i :map.keySet()){
            if(map.get(i)==1){
                list.add(i);
            }
        }
        ListNode pre = new ListNode(-1);
        ListNode p = pre;
        for(Integer i : list){
            p.next = new ListNode(i);
            p = p.next;
        }
        return pre.next;
    }
}
