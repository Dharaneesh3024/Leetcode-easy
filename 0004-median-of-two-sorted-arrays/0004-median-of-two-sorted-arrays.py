class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        n1 = len(nums1)
        n2 = len(nums2)
        new = []
        new.extend(nums1)
        new.extend(nums2)
        new.sort()
        n = len(new)
        
        if n % 2 != 0:
            ind = n // 2
            new_ind = new[ind]
            x = "{:.5f}".format(new_ind)
            return float(x)
        
        else:
            ind = n // 2
            new_ind = (new[ind] + new[ind - 1]) / 2.0
            x = "{:.5f}".format(new_ind)
            return float(x)

