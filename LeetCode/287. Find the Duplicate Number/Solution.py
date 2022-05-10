class Solution:
    def findDuplicate(self, nums) -> int:
        count = [0]*len(nums)
        for i in nums:
            if count[i]>0:
                return i
            else:
                count[i]=1
        return -1
