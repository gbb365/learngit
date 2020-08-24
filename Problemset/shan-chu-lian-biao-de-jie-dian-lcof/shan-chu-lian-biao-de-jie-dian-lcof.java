
// @Title: 删除链表的节点 (删除链表的节点 LCOF)
// @Author: 15218859676
// @Date: 2020-08-21 15:08:50
// @Runtime: 0 ms
// @Memory: 39.4 MB

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode pre = new ListNode(-1);
        ListNode cur = pre;
        pre.next = head;
        while(cur.next !=null){
            if(cur.next.val == val){
                cur.next = cur.next.next;
            }else{
                cur = cur.next;
            }
        }
        return pre.next;
    }
}
