class Solution:
    def maxProfit(self, prices) -> int:
        tp = 0
        for i in range(len(prices) - 1):
            if prices[i] < prices[i+1]:
                tp += prices[i+1] - prices[i]
        return tp