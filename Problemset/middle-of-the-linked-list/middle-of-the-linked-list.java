
// @Title: 链表的中间结点 (Middle of the Linked List)
// @Author: 15218859676
// @Date: 2020-08-19 16:19:41
// @Runtime: 0 ms
// @Memory: 37 MB

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        // ListNode fast = head.next;
        // ListNode slow = head;
        // while(fast!=null && fast.next!= null){
        //     fast = fast.next.next;
        //     slow = slow.next;
        // }
        // return slow;
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;

    }
}
