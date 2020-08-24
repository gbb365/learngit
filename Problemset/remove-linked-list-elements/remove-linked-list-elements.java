
// @Title: 移除链表元素 (Remove Linked List Elements)
// @Author: 15218859676
// @Date: 2020-08-19 15:54:47
// @Runtime: 1 ms
// @Memory: 40.9 MB

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode pre = new ListNode(-1);
        pre.next = head;
        ListNode newNode = pre;
        while(head!=null){
            if(head.val == val){
                newNode.next = head.next;
            }else{
                newNode = head;
            }
             head = head.next;
        }
        return pre.next;
    }
}
