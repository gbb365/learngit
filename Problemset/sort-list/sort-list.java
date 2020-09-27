
// @Title: 排序链表 (Sort List)
// @Author: 15218859676
// @Date: 2020-09-27 09:24:17
// @Runtime: 3 ms
// @Memory: 41.4 MB

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    /*
    1.划分链表
    2.归并merge
    */
    public ListNode sortList(ListNode head) {
        return head == null?null:mergeSort(head);
    }
    public ListNode mergeSort(ListNode head){
        if(head.next == null){
            return head;
        }
        ListNode p = head;
        ListNode q = head;
        ListNode pre = null;
        //找到中间的节点，断开连接，接着递归找每一段的中点
        while(q!=null&&q.next !=null){
            pre = p;
            p = p.next;
            q = q.next.next;
        }
        pre.next = null;
        ListNode l = mergeSort(head);
        ListNode r = mergeSort(p);
        return merge(l,r);
    }
    //对被分开的没一段链表进行合排序合并
    public ListNode merge(ListNode l,ListNode r){
        ListNode pre = new ListNode(0);
        ListNode cur = pre;
        while(l!=null&& r!=null){
            if(l.val<=r.val){
                cur.next = l;
                cur = cur.next;
                l = l.next;
            }else{
                cur.next = r;
                cur = cur.next;
                r = r.next;
            }
        }
        if(l!=null){
            cur.next = l;
        }
        if(r!=null){
            cur.next = r;
        }
        return pre.next;

    }
}
