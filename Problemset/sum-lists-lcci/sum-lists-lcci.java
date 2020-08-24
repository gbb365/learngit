
// @Title: 链表求和 (Sum Lists LCCI)
// @Author: 15218859676
// @Date: 2020-08-24 16:25:45
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
        /*和两数相加是同样的，注意最后可能的进位

        */
        int sum = 0 ;
        int carry = 0;
        ListNode node1 = l1;
        ListNode node2 = l2;
        ListNode pre = new ListNode(-1);
        ListNode cur = pre;
        while(node1 != null || node2 != null){
            int x = node1 == null? 0:node1.val;
            int y = node2 == null? 0:node2.val;
            sum = x + y + carry;
            ListNode res = new ListNode(sum%10);
            carry = sum/10;
            cur.next = res;
            cur = cur.next;
            node1 = node1 == null?null:node1.next;
            node2 = node2 == null?null:node2.next;
        }
        if(carry>0){
            cur.next = new ListNode(carry);
        }
        return pre.next;
    }
}
