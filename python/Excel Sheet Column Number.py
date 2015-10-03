'''
Q: Excel Sheet Column Number
Link: https://leetcode.com/problems/excel-sheet-column-number/

'''

class Solution(object):
    def titleToNumber(self, s):
        res = 0
        for ch in s:
            res *= 26
            res += ord(ch) - ord('A') + 1
        return res
