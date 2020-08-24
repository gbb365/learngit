
// @Title: 合并两个有序链表 (Merge Two Sorted Lists)
// @Author: 15218859676
// @Date: 2020-08-16 15:49:15
// @Runtime: 1 ms
// @Memory: 39.4 MB

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode(0);
        ListNode cur = pre;
        while(l1 !=null && l2!=null){
            if(l1.val<=l2.val){
                cur.next = l1;
                l1 = l1.next;
            }
            else{
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        if (l1 == null){
            cur.next = l2;
        }
        if (l2 ==null){
            cur.next = l1;
        }
        return pre.next;
    }
}
