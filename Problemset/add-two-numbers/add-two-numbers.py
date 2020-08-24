
# @Title: 两数相加 (Add Two Numbers)
# @Author: 15218859676
# @Date: 2020-08-14 11:32:33
# @Runtime: 60 ms
# @Memory: 12.9 MB

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """ 
        pre = ListNode(0)
        cur = pre
        carry = 0
        while(l1 or l2):
            x = l1.val if l1!=None else 0
            y = l2.val if l2!=None else 0

            sum = x + y + carry
            carry = sum/10
            tmp = ListNode(sum%10)
            cur.next = tmp
            cur = tmp
            if l1:
                l1 = l1.next
            if l2:
                l2 = l2.next
        if carry == 1:
            cur.next = ListNode(carry)

        return pre.next    
       
