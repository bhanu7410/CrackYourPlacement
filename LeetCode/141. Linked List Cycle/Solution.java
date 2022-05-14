public class Solution {
    
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public boolean hasCycle(ListNode head) {
        if(head == null || head.next==null){
            return false;
        }
        ListNode first = head ;
        ListNode last = head;
        while(first != null && first.next !=null){
            first = first.next.next;
            last = last.next;
            if (first == last ){
                return true;
            }
        }
        return false;
    }
}