
# @Title: 合并两个有序链表 (Merge Two Sorted Lists)
# @Author: 15218859676
# @Date: 2020-08-16 15:44:53
# @Runtime: 36 ms
# @Memory: 12.6 MB

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def mergeTwoLists(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        pre = ListNode(0)
        cur = pre

        while l1 and l2:
            # if not l1:
            #     cur.next = l2
            # elif not l2:
            #     cur.next = l1
            # L = l1 if l1.val<l2.val else l2
            # new_node = ListNode(L.val)
            # cur.next = new_node
            # cur = new_node
            # l2 = L.next
            if l1.val <= l2.val:
                cur.next = l1
                l1 = l1.next
            else:
                cur.next = l2 
                l2 = l2.next
            cur = cur.next
        cur.next = l1 if l1 else l2
        return pre.next

        
