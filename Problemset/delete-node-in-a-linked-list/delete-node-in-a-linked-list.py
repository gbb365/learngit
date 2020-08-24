
# @Title: 删除链表中的节点 (Delete Node in a Linked List)
# @Author: 15218859676
# @Date: 2020-08-17 13:46:18
# @Runtime: 36 ms
# @Memory: 13.3 MB

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def deleteNode(self, node):
        """
        :type node: ListNode
        :rtype: void Do not return anything, modify node in-place instead.
        """
        # node就是需要删除的节点，直接用替换法
        node.val = node.next.val
        node.next = node.next.next
