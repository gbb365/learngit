
// @Title: 二进制链表转整数 (Convert Binary Number in a Linked List to Integer)
// @Author: 15218859676
// @Date: 2020-08-22 12:16:01
// @Runtime: 0 ms
// @Memory: 37.3 MB

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        ListNode node = head;
        int len = 0 ;
        while(node != null){
            node = node.next;
            len += 1;
        }
        int[] res = new int[len];
        for(int i = res.length - 1 ; i >= 0 ; i--){
            res[i] = head.val;
            head = head.next;
        }
        int sum = 0;
        for(int i = 0 ;i < res.length;i++){
            sum += res[i]*Math.pow(2,i);
        }
        return sum;
    }
}
