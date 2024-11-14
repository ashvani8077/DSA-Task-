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
        String s="";
        ListNode temp=head;
        while(temp!=null){
            s=s+temp.val;
            temp=temp.next;
        }
        StringBuilder sb= new StringBuilder(s);
        sb=sb.reverse();
        s=String.valueOf(sb);
        temp=head;
        int i=0;
        while(temp!=null){
            if(temp.val!=(s.charAt(i)-'0')){
                return false;
            }
            i++;
            temp=temp.next;
        }
        return true;
    }
}