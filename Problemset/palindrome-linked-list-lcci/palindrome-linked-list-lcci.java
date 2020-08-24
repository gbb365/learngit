
// @Title: 回文链表 (Palindrome Linked List LCCI)
// @Author: 15218859676
// @Date: 2020-08-21 16:03:51
// @Runtime: 2 ms
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
        //方法1.使用头插法，构造一个新的链表，和原链表比较
        //空链表也是回文
        // if(head == null || head.next == null){
        //     return true;
        // }
        // ListNode cur = head;
        // ListNode q = null;
        // while(cur != null){
        //     q = new ListNode(cur.val,q);
        //     cur = cur.next;
        // }
        // while(q !=null){
        //     // 移动节点的时候一定要看清是不是写错了head的值啊，浪费时间还不容易发现、
        //     if(q.val != head.val){
        //         return false;
        //     }else{
        //     q = q.next;
        //     head = head.next;
        //     }
        // }
        // return true;
        
        //方法2.不适用额外的空间。使用快慢指针，反转一半的链表。和前面的做对比
        if(head == null || head.next == null){
            return true;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next !=null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        slow = reverse(slow.next);
        while(slow != null){
            if(slow.val != head.val){
                return false;
            }
            slow = slow.next;
            head = head.next;
        }
        return true;


    }
    public ListNode reverse(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode cur = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return cur;
    }
}
