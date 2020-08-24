
// @Title: 删除中间节点 (Delete Middle Node LCCI)
// @Author: 15218859676
// @Date: 2020-08-21 10:26:58
// @Runtime: 0 ms
// @Memory: 39.4 MB

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
