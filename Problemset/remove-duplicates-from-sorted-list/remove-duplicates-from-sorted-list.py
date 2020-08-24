
# @Title: 删除排序链表中的重复元素 (Remove Duplicates from Sorted List)
# @Author: 15218859676
# @Date: 2020-08-17 10:43:12
# @Runtime: 60 ms
# @Memory: 13.7 MB

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def deleteDuplicates(self, head: ListNode) -> ListNode:
        
        cur = head
        while  cur.next:
            if cur.val == cur.next.val:
                cur.next = cur.next.next
            else:
                cur = cur.next
        return head
            
              
       

 cur.next

        return head
