class Solution(object):
    def missingNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        n = len(nums)
        s=n*(n+1)/2
        su=sum(nums)

        return s-su