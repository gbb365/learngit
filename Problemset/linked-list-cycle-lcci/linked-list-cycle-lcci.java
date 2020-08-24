
// @Title: 环路检测 (Linked List Cycle LCCI)
// @Author: 15218859676
// @Date: 2020-08-24 15:54:57
// @Runtime: 0 ms
// @Memory: 39.8 MB

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
    public ListNode detectCycle(ListNode head) {
        //快慢指针，和相交链表一样的做法，让快慢指针相遇，然后让一个指针回到head，和另外一个一起走
        //相遇的时候，这个就是第一个入环节点
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                fast =  head;
                while(fast != slow){
                    fast = fast.next;
                    slow = slow.next;
                }
                return fast;
            }
        }
        return null;
    }
}
