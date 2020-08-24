
// @Title: 返回倒数第 k 个节点 (Kth Node From End of List LCCI)
// @Author: 15218859676
// @Date: 2020-08-23 21:32:54
// @Runtime: 0 ms
// @Memory: 37.6 MB

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int kthToLast(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;
        while(k > 0 ){
            fast = fast.next;
            k--;
        }
        if(fast == null){
            return slow.val;
        }else{
        while(fast !=null && fast.next !=null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow.next.val;
        }
    }
}
