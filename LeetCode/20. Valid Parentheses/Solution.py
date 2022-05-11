from collections import deque
class Solution:
    def isValid(self, s: str) -> bool:
        
        if len(s)%2 != 0:
            return False
        
        stack = deque([])
        opens = ['(' , "[" , '{']
        matches = {
            '(' : ')' ,
            '[' :']' ,
            '{' : '}'
        }
        for c in s:
            
            if c in opens:
                stack.appendleft(c)
            else:
                if len(stack) == 0:
                    return False
                last_open = stack.popleft()
                if matches[last_open] != c:
                    return False
        
        return len(stack) == 0