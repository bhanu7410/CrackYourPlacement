class Solution:
    def isHappy(self, n: int) -> bool:
        seen = {n: True}
        
        while n != 1:
            aux_n = 0
            while n:
                aux_n += (n%10)*(n%10)
                n //= 10
            n = aux_n
            
            if n not in seen:
                seen[n] = True
            else:
                break
        
        return n == 1