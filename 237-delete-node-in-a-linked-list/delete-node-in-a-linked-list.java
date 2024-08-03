/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode temp = node;

        while(temp != null){
            temp.val = temp.next.val;
            temp = temp.next;
            
            if(temp.next == null){
                temp=null;
                break;
            }
        }

        ///removing the last node

        while(node.next.next != null){
            node = node.next;
        }
        node.next = null;
    }
}