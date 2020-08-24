
// @Title: 删除排序链表中的重复元素 (Remove Duplicates from Sorted List)
// @Author: 15218859676
// @Date: 2020-08-17 11:08:22
// @Runtime: 1 ms
// @Memory: 39.8 MB

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
        ListNode cur = head;
        if(head == null || head.next == null ){
            return head;
        }
        while(cur != null && cur.next != null){
            if(cur.val == cur.next.val){
                cur.next = cur.next.next;
            }else{
                cur = cur.next;
            }
        }
        return head;
    }
}
