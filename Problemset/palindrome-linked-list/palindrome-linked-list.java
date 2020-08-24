
// @Title: 回文链表 (Palindrome Linked List)
// @Author: 15218859676
// @Date: 2020-08-18 16:15:57
// @Runtime: 1 ms
// @Memory: 43.8 MB

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        
        slow = reverse(slow.next);
        while(slow !=null){
            if (slow.val != head.val){
                return false;
            }
            slow = slow.next;
            head = head.next;
        }
        return true;
    }
    public ListNode reverse(ListNode head){
        if(head.next == null){
            return head;
        }
        ListNode cur = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return cur;
    }
}
