
// @Title: 对链表进行插入排序 (Insertion Sort List)
// @Author: 15218859676
// @Date: 2020-10-15 17:40:02
// @Runtime: 28 ms
// @Memory: 37.9 MB


//Definition for singly-linked list.
//static class ListNode {
//    int val;
//    ListNode next;
//    ListNode(int x) { val = x; }
//}

class Solution {
    public ListNode insertionSortList(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode dummpy = new ListNode(0);
        ListNode cur = head;
        ListNode pre = dummpy;
        ListNode next = null;
        while(cur != null){
            next = cur.next;
            while(pre.next != null && pre.next.val < cur.val){
                pre = pre.next;
            }
            cur.next = pre.next;
            pre.next = cur;
            pre = dummpy;
            cur = next;
        }
        return dummpy.next;
    }
}

