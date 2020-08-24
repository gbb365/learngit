
// @Title: 移除重复节点 (Remove Duplicate Node LCCI)
// @Author: 15218859676
// @Date: 2020-08-22 12:02:02
// @Runtime: 361 ms
// @Memory: 40.1 MB

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeDuplicateNodes(ListNode head) {
        // Set<ListNode> set = new HashSet<ListNode>();
        //方法1.使用一个辅助的有序集合，遍历链表，过滤掉重复的数字，然后遍历set中的元素新建一个链表，返回头结点
        // Map<Integer,ListNode> map = new LinkedHashMap<Integer,ListNode>();
        // ListNode cur = head;
        // while( cur != null){
        //     if(map.containsKey(cur.val)){
        //         cur = cur.next;
        //     }else{
        //     map.put(cur.val,cur);
        //     cur = cur.next;
        //     }
        // }
        // ListNode pre = new ListNode(-1);
        // ListNode res = pre;
        // for(ListNode node:map.values()){
        //     res.next = node;
        //     res = res.next;
        // }
        // res.next = null;
        // return pre.next;

        //方法2.暴力法，两重遍历.每次指定一个点，然后遍历剩下的，相同的就删掉
        ListNode node1 = head;
        ListNode node2 = null;
        while(node1 !=null){
            node2 = node1;
            while(node2.next !=null){
                if(node1.val == node2.next.val){
                   node2.next = node2.next.next;
                }else{
                    node2 = node2.next;
                }
            }
            node1 = node1.next;
        }
        return head;
    }
}
