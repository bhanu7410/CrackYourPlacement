class Solution:
    def convertToTitle(self, columnNumber: int) -> str:
        d = dict(zip(range(26), 'abcdefghijklmnopqrstuvwxyz'.upper()))
        result = ''
        while columnNumber > 0:
            result += d[(columnNumber - 1) % 26]
            columnNumber = (columnNumber - 1) // 26
        return result[::-1]