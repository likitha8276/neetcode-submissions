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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return head;
        
        ListNode dummy = new ListNode(0,head);
        int l = 0;
        ListNode curr = head;
        while(curr!=null){
            l+=1;
            curr=curr.next;
        }
        ListNode prev = dummy;
        for(int i=0;i<l-n;i++){
            prev = prev.next;
        }
        prev.next = prev.next.next;
        return dummy.next;

    }
    public void printList(ListNode head){
        ListNode curr = head;
        while(curr!=null){
            System.out.print(curr.val+" ");
            curr = curr.next;
        }
    }
}
