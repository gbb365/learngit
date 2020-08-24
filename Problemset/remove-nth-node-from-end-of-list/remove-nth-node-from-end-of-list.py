
# @Title: 删除链表的倒数第N个节点 (Remove Nth Node From End of List)
# @Author: 15218859676
# @Date: 2020-08-16 14:52:13
# @Runtime: 24 ms
# @Memory: 12.7 MB

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        # pre = ListNode(0)
        # pre.next = head
        
        # i = 0 
        # while i < n :
        #     head  = head.next
        #     i+=1
        # if not head :
        # # if head is None:
        #     pre.next = pre.next.next;
        #     return pre.next
        # cur = pre.next
        # while head.next :
        # # while head.next is not None:
        #     cur = cur.next
        #     head = head.next
        # cur.next = cur.next.next
        # return pre.next
        pre = ListNode(0)
        pre.next = head
        fast = pre
        slow = pre
        i = 0 
        while i < n :
            fast = fast.next
            i += 1
        while fast.next:
            fast = fast.next
            slow = slow.next
        slow.next = slow.next.next
        return pre.next




