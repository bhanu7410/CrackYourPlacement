class Solution:
    def longestCommonPrefix(self, strs) -> str:        
        if len(strs)==0 :
            return ""
        shortest = min(strs,key=len)
        for i, ch in enumerate(shortest):
            for other in strs:
                if other[i] != ch:
                    return shortest[:i]
        return shortest