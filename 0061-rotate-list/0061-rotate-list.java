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
  
    
                if (head==null || head.next ==null){
                         return head;
                }
        
        
        
                int i = 1;
                ListNode d = head;
                ListNode tmp = head;
        
        
                while (tmp.next!= null){
                        i++;
                     tmp=tmp.next;
                }
        
        
                tmp.next = head;
                head= tmp;
                int ans = i - k%i;
        
                while (ans>1){
                 d=d.next;
                 ans--;
                }
        
                 head= d.next;
                 d.next = null;

                 return head;

 
    }
}