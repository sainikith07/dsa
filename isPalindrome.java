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
    public boolean isPalindrome(ListNode head) {
        ListNode f=head;
        ListNode s=head;
        while(f!=null && f.next!=null){
            f=f.next.next;
            s=s.next;
        }
        ListNode cur=s;
        ListNode pre=null;
        ListNode nex=s;
        while(cur!=null){
            nex=cur.next;
            cur.next=pre;
            pre=cur;
            cur=nex;
        }
        f=head;
        while(f!=null&&pre!=null){
            if(f.val!=pre.val) return false;
            f=f.next;
            pre=pre.next;
        }
        return true;
    }
}
