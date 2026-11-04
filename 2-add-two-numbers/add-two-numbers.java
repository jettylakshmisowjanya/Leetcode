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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode res = new ListNode(0);
        ListNode ptr = res;
        int r=0;
        while(p1!=null || p2!=null || r!=0){
            int s = r;
            if(p1!=null){
                s = s + p1.val;
                p1 = p1.next;
            }

            if(p2!=null){
                s = s + p2.val;
                p2 = p2.next;
            }

            r = s / 10;
            ptr.next = new ListNode(s%10);
            ptr = ptr.next;

        }
        
        return res.next;
    }
}