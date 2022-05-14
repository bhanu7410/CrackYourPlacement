class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def deleteDuplicates(self, head: ListNode) -> ListNode:
        x=head
        while x!=None and x.next !=None :
            if x.next.val == x.val:
                x.next = x.next.next
            else:
                x=x.next
        return head