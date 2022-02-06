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
        ListNode node = new ListNode(0);
        ListNode result = node; // 7 0 8 
        int carry = 0;
        
        while (l1 != null || l2 != null) {
            int sum = carry; // 1
            
            if (l1 != null) {
                sum += l1.val; // 3
                l1 = l1.next; // null
            }
            
            if (l2 != null) {
                sum += l2.val; // 4 // sum: 8
                l2 = l2.next; // null
            }
            
            if (sum >= 10) { // 8
                node.next = new ListNode(sum - 10); // new ListNode(0)
                carry = 1; //  올림수 발생
            } else {
                node.next = new ListNode(sum); // new ListNode(8)
                carry = 0;
            }
            
            node = node.next; // new ListNode(8)
        }
        
        if (carry == 1) {
            node.next = new ListNode(1);
        }
        // result 7 0 8
        return result.next;
    }
}