
// @Title: 两个链表的第一个公共节点 (两个链表的第一个公共节点  LCOF)
// @Author: 15218859676
// @Date: 2020-08-23 21:50:43
// @Runtime: 1 ms
// @Memory: 42.6 MB

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headB == null || headA == null){
            return null;
        }
        ListNode node2 = headB;
        while(node2.next != null){
            node2 = node2.next;
        }
        node2.next = headB;
        //同时从headA出发
        ListNode fast = headA;
        ListNode slow = headA;
        while(fast != null && fast.next !=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                fast = headA;
                while(fast != slow){
                    fast = fast.next;
                    slow = slow.next;
                }
                node2.next = null;
                return fast;
            }
        }
        node2.next = null;
        return null;
    }
}
