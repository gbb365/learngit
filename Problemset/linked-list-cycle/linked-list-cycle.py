
# @Title: 环形链表 (Linked List Cycle)
# @Author: 15218859676
# @Date: 2020-08-19 11:55:44
# @Runtime: 40 ms
# @Memory: 19 MB

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def hasCycle(self, head):
        """
        :type head: ListNode
        :rtype: bool
        """
        fast = head
        slow = head
        while fast  and  fast.next :
            fast = fast.next.next
            slow = slow.next
            if fast == slow:
                return True
        return False
