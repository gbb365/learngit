
# @Title: 对链表进行插入排序 (Insertion Sort List)
# @Author: 15218859676
# @Date: 2020-08-24 21:21:59
# @Runtime: 2144 ms
# @Memory: 15.4 MB

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def insertionSortList(self, head: ListNode) -> ListNode:
        new = ListNode(-2**31) # 设定排序链表初始空间
        cur1 = head
        while cur1:
            tmp = cur1.next # 存储后继节点
            cur1.next = None # 切断
            curn = new # 第二指针
            while curn:
                if curn.next is None: # 判空
                    curn.next = cur1
                    break
                elif curn.next.val > cur1.val: # 排序
                    t = curn.next
                    curn.next = cur1
                    curn.next.next = t
                    break
                curn = curn.next
            cur1 = tmp # 这样滑动的好处可以同前继节点断开，成为一个新链表的头节点，而不是在老链表中滑动
        return new.next

