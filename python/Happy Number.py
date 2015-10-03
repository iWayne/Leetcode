'''
Q: Happy Number
Link: https://leetcode.com/problems/happy-number/

'''

class Solution(object):
    def isHappy(self, n):
        s = set()
        
        while n != 1:
            if n in s:
                return False
            else:
                s.add(n)
                
            sum = 0
            while n != 0:
                digit = n%10
                n /= 10
                sum += digit**2
            n = sum
        
        return True
        