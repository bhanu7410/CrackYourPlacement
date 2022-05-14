
class Solution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode middleNode(ListNode head) {
        ListNode tail = head;
        while (head != null && head.next!=null){
            head = head.next.next;
            tail = tail.next;
        }
        return tail;
    }
}