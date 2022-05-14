class Solution:
    def hasCycle(self, head) -> bool:
        
        if head is None:
            return False
        
        slow = fast = head
        
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            
            if fast == slow:
                return True
            
        
        return False