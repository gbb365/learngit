
# @Title: 回文链表 (Palindrome Linked List)
# @Author: 15218859676
# @Date: 2020-08-17 15:04:29
# @Runtime: 136 ms
# @Memory: 48.9 MB

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def isPalindrome(self, head):
        """
        :type head: ListNode
        :rtype: bool
        """
        p , q = head,None
        while p:
            q = ListNode(p.val,q)
            p = p.next
        while q and q.val == head.val:
            q,head = q.next,head.next
        return q is None 


        
