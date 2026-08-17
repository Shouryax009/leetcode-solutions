/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public int getlength(ListNode head){
       int len=0;
        while(head!=null){
            len++;
            head=head.next;
        }
        return len;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int len1=getlength(headA);
        int len2=getlength(headB);
        int diff=Math.abs(len1-len2);
        if(len1>len2){
            while(diff-- >0){
                headA=headA.next;
            }
        }
        else{
            while(diff-- > 0){
                headB=headB.next;
            }
        }
        while(headA!=null && headB!=null){
        if(headA==headB){
                return headA;
            }
            headA=headA.next;
            headB=headB.next;
        }
        return null;
    }
}