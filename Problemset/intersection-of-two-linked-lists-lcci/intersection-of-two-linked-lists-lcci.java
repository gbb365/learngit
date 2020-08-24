
// @Title: 链表相交 (Intersection of Two Linked Lists LCCI)
// @Author: 15218859676
// @Date: 2020-08-21 16:54:23
// @Runtime: 1 ms
// @Memory: 42.6 MB

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
        //方法1。类似找环形链表的第一个入环节点的做法。随便遍历一个链表，将它的尾节点链接到head
        //同时遍历两个链表，如果没有环证明肯定没有相交节点。
        //如果有环，证明相交。让slow重新回到head，快慢指针肯定可以在环上面相遇。类似操场跑步
        if(headA == null || headB == null){
            return null;
        }
        ListNode node = headB;
        while(node.next !=null){
            node = node.next;
        }
        node.next = headB;
        ListNode fast = headA;
        //同时从A出发
        ListNode slow = headA;
        while(fast != null && fast.next !=null){
            fast = fast.next.next;
            slow = slow.next;
            //证明有环,循环
            if(fast == slow){
                fast = headA;
                while(fast != slow){
                    //再次强调，移动节点不要写错节点
                    fast = fast.next;
                    slow = slow.next;
                }
                node.next =null;
                return fast;
            }
        }
        node.next =null;
        return null;

        
        
        //方法2，根据路程相等 
        // ListNode a = headA;
        // ListNode b = headB;
        // if(a == null || b==null){
        //     return null;
        // }
        // while( a != b){
        //     //不想交当他们走了对方的路后都会一起走到终点，返回null的
        //     a = a==null?headB:a.next;
        //     b = b==null?headA:b.next;
        // }
        // return a;


        //方法3.屁股对齐法
    //     ListNode b = headB;
    //     ListNode a = headA;
    //     int lena = 0;
    //     int lenb = 0;
    //     while(b !=null){
    //         b = b.next;
    //         lenb++;
    //     }
    //     while(a != null){
    //         a = a.next;
    //         lena++;
    //     }
    //    int  diff = lena - lenb;
    //     if(diff>0){
    //         while(diff>0){
    //             headA = headA.next;
    //             diff -= 1;
    //         }
    //     }else if(diff<0){
    //         while(diff<0){
    //             headB = headB.next;
    //             diff +=1;
    //         }
    //     }
    //     while( headA != headB){
    //         headA = headA.next;
    //         headB = headB.next;
    //     }
    //     return headA;




    }
}
