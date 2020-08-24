
// @Title: 反转链表 (反转链表 LCOF)
// @Author: 15218859676
// @Date: 2020-08-21 10:14:50
// @Runtime: 0 ms
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
    public ListNode reverseList(ListNode head) {
        //1.迭代法
        // ListNode pre = null;
        // ListNode tmp = null;
        // while(head !=null){
        //     tmp = head.next;
        //     head.next = pre;
        //     pre = head;
        //     head = tmp;
        // }
        // return pre;
        
        //2.递归法
        if(head == null || head.next == null){
            return head;
        }
        ListNode cur = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return cur;
    }
}
