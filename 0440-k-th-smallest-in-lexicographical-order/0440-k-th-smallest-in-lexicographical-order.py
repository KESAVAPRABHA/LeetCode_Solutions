class Solution(object):
    def findKthNumber(self, n, k):
        def count_steps(curr, n):
            steps = 0
            first = curr
            last = curr
            while first <= n:
                steps += min(n, last) - first + 1
                first *= 10
                last = last * 10 + 9
            return steps
        
        curr = 1
        k -= 1  # Subtract 1 because we consider the first number as curr
        
        while k > 0:
            steps = count_steps(curr, n)
            if steps <= k:
                curr += 1
                k -= steps
            else:
                curr *= 10
                k -= 1
        
        return curr
