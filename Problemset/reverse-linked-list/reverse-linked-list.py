
# @Title: 反转链表 (Reverse Linked List)
# @Author: 15218859676
# @Date: 2020-08-17 11:54:28
# @Runtime: 32 ms
# @Memory: 14.8 MB

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        # n1 = None
        # n2 = head 
        # while(head and head.next):
        #     head.next = n1
        #     # 用错了中间变量。当head.next改变后。原来的链表断了。n2找不到下一个的。，因此先存n2
        #     n1 = n2
        #     n2 = n2.next
        #     head = n2
        # return head
        pre = None 
        while head:
            tmp = head.next
            head.next = pre
            pre = head
            head = tmp
        return pre
