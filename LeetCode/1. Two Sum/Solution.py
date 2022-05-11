class Solution:
    def twoSum(self, nums, target):
        buff_dict = {}
        for i in range(len(nums)):
            if nums[i] in buff_dict:
                return [buff_dict[nums[i]], i]
            buff_dict[target - nums[i]] = i