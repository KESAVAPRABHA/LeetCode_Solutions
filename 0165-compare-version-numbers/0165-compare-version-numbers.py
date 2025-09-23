class Solution(object):
    def compareVersion(self, v1, v2):
        v1Arr = v1.split(".")
        v2Arr = v2.split(".")
        
        max_length = max(len(v1Arr), len(v2Arr))
        
        for i in range(max_length):
            n1 = int(v1Arr[i]) if i < len(v1Arr) else 0
            n2 = int(v2Arr[i]) if i < len(v2Arr) else 0
            
            if n1 > n2:
                return 1
            elif n1 < n2:
                return -1
        
        return 0