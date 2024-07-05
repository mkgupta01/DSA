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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ArrayList<Integer> criticalPoints = new ArrayList<>();
        ListNode prev = head;
        head = head.next;
        int pos = 1;
        while(head.next != null){
            if(head.val > prev.val && head.next.val < head.val || head.val < prev.val && head.next.val > head.val){
                criticalPoints.add(pos);
            }
            head = head.next;
            prev = prev.next;
            pos++;
        }

        if(criticalPoints.size() < 2){
            return new int[] {-1,-1};
        }

        int max = criticalPoints.get(criticalPoints.size()-1) - criticalPoints.get(0);
        int min = Integer.MAX_VALUE;
        for(int i=0;i<criticalPoints.size()-1;i++){
            if(criticalPoints.get(i+1) - criticalPoints.get(i) < min){
                min = criticalPoints.get(i+1) - criticalPoints.get(i);
            }
        }
        return new int[] {min, max};
    }
}