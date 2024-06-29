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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode ans = new ListNode(0);
        ArrayList<Integer> list = new ArrayList<>();
        for(ListNode tmp : lists){
            while(tmp != null){
                list.add(tmp.val);
                tmp = tmp.next;
            }
        }

        Collections.sort(list);
        
        ListNode temp = ans;
        for(int i : list){
            ListNode node = new ListNode(i);
            temp.next =  node;
            temp = temp.next;
        }
        return ans.next;
    }
}