class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def getDecimalValue(self, head: ListNode) -> int:
        num=0
        while head:
            num=num*2+head.val
            # num+=head.val
            head=head.next
        return num