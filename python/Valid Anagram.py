'''
Q: Valid Anagram
Link: https://leetcode.com/problems/valid-anagram/

'''

class Solution(object):
    def isAnagram(self, s, t):
        return sorted(s) == sorted(t)
        