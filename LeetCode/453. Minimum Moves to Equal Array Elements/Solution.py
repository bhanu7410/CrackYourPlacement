class Solution:

    def minMoves(self, nums) -> int:
        nums.sort()
        count = 0 
        min_val = nums[0]
        for i in range(len(nums)-1, 0, -1):
            val = nums[i] + count
            difference = val - min_val
            count+=difference
            min_val = val
        return count