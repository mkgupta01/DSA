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
    public ListNode mergeNodes(ListNode head) {
        ListNode ans = new ListNode(0);
        ListNode res = ans;
        ListNode temp = head.next;
        int currSum = 0;
        while(temp != null){
            currSum+=temp.val; 
            if(temp.val == 0 && currSum != 0){
                ans.next = new ListNode(currSum);
                ans = ans.next;
                currSum = 0;
            }
            temp = temp.next;
        }
        return res.next;
    }
}