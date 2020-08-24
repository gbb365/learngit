
// @Title: 环形链表 (Linked List Cycle)
// @Author: 15218859676
// @Date: 2020-08-19 11:53:07
// @Runtime: 0 ms
// @Memory: 40 MB

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow ){
                return true;
            }
        }
        return false;
    }
}
