/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(k == 0 || head == null || head.next == null){
            return head;
        }

        int size = 1;
        ListNode last = head;
        

        while(last.next != null){
            size++;
            last = last.next;
        }

        k = k % size;
        if(k == 0){
            return head;
        }

        last.next = head;
        ListNode tail = head;

        for(int i=0;i < size-k-1;i++){
            tail = tail.next;
        }

        ListNode ans = tail.next;
        tail.next = null;
        return ans;
    
    }
}