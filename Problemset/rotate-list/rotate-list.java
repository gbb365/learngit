
// @Title: 旋转链表 (Rotate List)
// @Author: 15218859676
// @Date: 2020-10-22 12:31:16
// @Runtime: 1 ms
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
    public ListNode rotateRight(ListNode head, int k) {
        /**
            旋转链表，让每个节点向右移动K个位置：将最后一个链表节点移动到最前端，重复k次这个过程。
            K大于链表的长度怎么搞（讨论区：k = k > 链表长度 ？ k % 链表长度 : k;）
            K大于链表的长度时相当于有一个过程是复原了链表，K%n
            过程：找到倒数k+1个节点slow，tail的next置为head，slow.next=head,slow.next = null;
            
        */
        if(head == null||head.next == null){
            return head;
        }
        ListNode cur = head;
        int len = 0;
        ListNode tail = null;
        //统计链表长度，找到尾节点的位置
        while(cur!=null){
            len++;
            tail = cur;
            cur = cur.next;
        }
        //移动次数
        int n = k%len;
        //n==0,不需要移动，直接返回,后面的判断操作都不用搞了，减少了执行的时间。
        if(n==0){
            return head;
        }
        //找到倒数k+1个节点的位置,快指针先走k步
        ListNode fast = head;
        while(n != 0){
            fast = fast.next;
            n--;
        }
        ListNode slow = head;
        //找到了slow，这里就是要断开的位置
        while(fast.next !=null){
            fast = fast.next;
            slow = slow.next;
        }
        tail.next = head;
        head = slow.next;
        slow.next = null;     
        return head;
        
    }
}
