
# @Title: 链表的中间结点 (Middle of the Linked List)
# @Author: 15218859676
# @Date: 2020-08-19 16:21:20
# @Runtime: 12 ms
# @Memory: 12.9 MB

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def middleNode(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        fast = head 
        slow = head 
        while  fast and fast.next:
            fast = fast.next.next
            slow = slow.next
        return slow
