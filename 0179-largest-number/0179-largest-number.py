class Solution(object):
    def cmp(self, a, b):
        if a + b > b + a:
            return -1
        return a + b < b + a
    def largestNumber(self, nums):
        a1 = list(map(str, nums))
        
        a1.sort(key=cmp_to_key(self.cmp))

        if a1[0] == '0':
            return "0"

        return ''.join(a1)