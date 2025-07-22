class Solution(object):
    def twoSum(self, nums, target):
       res={}
       for ind,val in enumerate(nums):
            diff=target-val
            if diff in res:
                return[res[diff],ind]
            res[val]=ind
        