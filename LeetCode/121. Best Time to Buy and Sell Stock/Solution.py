
class Solution:
    def maxProfit(self, pri) -> int:
        mini=float('inf')
        pro=0
        for i in pri:
            if(mini>i):
                mini=i
            if((i-mini)>pro):
                pro=(i-mini)
        return pro