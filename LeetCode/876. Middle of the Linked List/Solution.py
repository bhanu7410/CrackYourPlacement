class Solution:
    def middleNode(self, head):
        node = head.next
        half = head
        while node:
            node = node.next
            half = half.next
            if node:
                node = node.next
        return half