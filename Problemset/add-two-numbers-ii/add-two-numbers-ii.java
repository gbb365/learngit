
// @Title: 两数相加 II (Add Two Numbers II)
// @Author: 15218859676
// @Date: 2020-08-24 16:43:36
// @Runtime: 2 ms
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //基础版本，先对两个链表进行翻转
        ListNode n1 = reverse(l1);
        ListNode n2 = reverse(l2);
        ListNode pre = new ListNode(-1);
        ListNode cur = pre;
        int carry = 0;
        int sum = 0;
        while( n1 != null || n2 != null){
            int x = n1 == null? 0:n1.val;
            int y = n2 == null? 0:n2.val;
            sum = x+y+carry;
            ListNode res = new ListNode(sum%10);
            carry = sum/10;
            cur.next = res;
            cur = cur.next;
            if(n1 !=null){
                n1 = n1.next;
            }
            if(n2 != null){
                n2 = n2.next;
            }
        }
        if(carry>0){
            cur.next = new ListNode(carry);
        }
        return reverse(pre.next);
    }

    public ListNode reverse(ListNode head){
        if(head == null || head.next==null){
            return head;
        }
        ListNode cur = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return cur;
    }
}
