
// @Title: 相交链表 (Intersection of Two Linked Lists)
// @Author: 15218859676
// @Date: 2020-08-20 10:19:54
// @Runtime: 1 ms
// @Memory: 42.7 MB

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // 方法3.构造环形链表，将b他的头节点连起来，新建两个快慢指针指向a，当两个指针相遇的时候就表明肯定相交
        //然后把慢指针重新回到a，和快指针一起跑。相遇的那个就是第一个相交的节点，返回，断开b，否则a=null
        //证明没有相交，将b断开，返回null
        if(headA == null || headB == null){
            return null;
        }
        ListNode last = headB;
        //注意这里是循环条件不要写last!=null
        while(last.next != null){
            last = last.next;
        }
        //空指针异常
        last.next = headB;
        ListNode fast = headA;
        ListNode slow = headA;
        while(fast != null && fast.next !=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                //为什么是慢指针回到头呢，而且为什么是快慢一起跑就一定可以相遇呢
                slow = headA;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                last.next = null;
                return fast;
            }
        }
        last.next = null;
        return null;












        // 暴力法，时间复杂度过高。不适合
        // ListNode cur1 = headA;
        // while(cur1 != null){
        //     ListNode cur2 = headB;
        //     while(cur2 != null){
        //         if(cur1 == cur2){
        //             return cur1;
        //         }
        //         cur2 = cur2.next;
        //     }
        //     cur1 = cur1.next;
        // }
        // return null;

        //方法2.使用长度差
        // ListNode head1 = headA;
        // ListNode head2 = headB;
        // int len1 = 0 ;
        // int len2 = 0 ;
        // while(head1 != null){
        //     head1 = head1.next;
        //     len1 += 1;
        // }
        // while( head2 != null){
        //     head2 = head2.next;
        //     len2 += 1;
        // }
        // int diff = len1 - len2;
        // head1 = headA;
        // head2 = headB;
        // if(diff > 0 ){
        //     //这里也写错了，应该放到外面，不然else会搞乱headb
        //     // head1 = headA;
        //     //这里的循环条件写错了，应该是通过相差的步数来调整循环的
        //     // while(head1 !=null){
        //     while(diff>0){
        //         head1 = head1.next;
        //         diff-= 1;
        //     }
        // }else if(diff < 0 ){
        //     // head2 = headB;
        //     // while(head2!=null){
        //     while(diff< 0){
        //         head2 = head2.next;
        //         diff+=1;
        //     }
        // }
        // // while(head1 != head2){
        // //     head1 = head1.next;
        // //     head2= head2.next;
        // // }
        // // return head1;
        // while(head1 != null && head2 !=null){
        //     //这里的顺序不能放到下面，不然就会出现已经重合了（两个链表都是指向一个节点），又next了一次，却返回null
        //     if (head1 == head2){
        //         return head1;
        //     }
        //     head1 = head1.next;
        //     head2 = head2.next;
        // }
        // return null;
    }
}
