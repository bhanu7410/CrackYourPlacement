public class Solution {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    

    public static int Size(ListNode head)
     { 
         int i=0;
         
         ListNode t=head;
         while(t.next!=null)
         {
             t=t.next;
             i++;
         }
         return i;
     }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int t1s=Size(headA);
        int t2s=Size(headB);
        if(t1s>t2s)
        {
            for(int i =0;i<t1s-t2s;i++)
            {
                headA=headA.next;
            }
        }
        else
        {
            for(int i =0;i<t2s-t1s;i++)
            {
                headB=headB.next;
            }
        }
        while(headA!=headB){
            headA=headA.next;
            headB=headB.next;
        }            
        return headA;
    }
}