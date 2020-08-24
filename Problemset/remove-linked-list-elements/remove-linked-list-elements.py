
# @Title: 移除链表元素 (Remove Linked List Elements)
# @Author: 15218859676
# @Date: 2020-08-19 16:05:01
# @Runtime: 72 ms
# @Memory: 19.6 MB

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def removeElements(self, head, val):
        """
        :type head: ListNode
        :type val: int
        :rtype: ListNode
        """
        pre = ListNode(-1)
        pre.next = head
        cur = pre
        while cur.next:
            if cur.next.val == val:
                cur.next = cur.next.next
            else:
                cur = cur.next
        return pre.next

        # sentinel = ListNode(0)
        # sentinel.next = head # 设置哨兵节点

        # prev, cur = sentinel, head # 前继节点，当前节点

        # while cur: # 循环终止条件
        #     if cur.val == val:
        #         prev.next = cur.next  # 删除节点
        #     else:
        #         prev = cur # 前继指针滑动
        #     cur = cur.next # 当前指针滑动
        
        # return sentinel.next

        # pre = ListNode(-1)
        # pre.next = head
        # cur = head
        # newpre = pre
        # while not cur:
        #     if cur.val == val:
        #         newpre.next = cur.next
        #     else:
        #         newpre = cur
        #     cur = cur.next
        # return pre.next
