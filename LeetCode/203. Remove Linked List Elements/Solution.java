 

class Solution {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return null;
        }
        ListNode ans=new ListNode();
        ans.next = head;
        ListNode cur=new ListNode();
        cur.next = ans;        
        while(cur.next!=null){
            if(cur.next.val == val){
                cur.next = cur.next.next;
            }
            else{
                cur = cur.next;
            }
        }
        return ans.next;
    }
}