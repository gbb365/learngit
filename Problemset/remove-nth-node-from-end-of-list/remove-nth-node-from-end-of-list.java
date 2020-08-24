
// @Title: 删除链表的倒数第N个节点 (Remove Nth Node From End of List)
// @Author: 15218859676
// @Date: 2020-08-16 11:01:52
// @Runtime: 0 ms
// @Memory: 38.1 MB

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // int i = 0;
        // ListNode  pre = new ListNode(0);
        // pre.next = head;
        // while(i < n ){
        //     head = head.next;
        //     i++;
        // }
        // ListNode cur = pre.next;
        // if(head == null){
        //     pre.next = pre.next.next;
        //     return pre.next;
        // }
        // while (head.next!=null){
        //     cur = cur.next;
        //     head = head.next;
        // }
        // cur.next = cur.next.next;
        // return pre.next;
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode start = pre, end = pre;
        while(n != 0) {
            start = start.next;
            n--;
        }
        while(start.next != null) {
            start = start.next;
            end = end.next;
        }
        end.next = end.next.next;
        return pre.next;


    }
}
