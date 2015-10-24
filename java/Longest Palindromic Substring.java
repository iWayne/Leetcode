/**
* Q: Longest Palindromic Substring
* S: Insert '#'
* Link: https://leetcode.com/problems/longest-palindromic-substring/
* Time: O(n^2)
* Space: O(n)
*/

public class Solution {
    public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }
        String modifiedS = "#";
        for (int i = 0; i < s.length(); i++) {
            modifiedS += s.charAt(i) + "#";
        }
        
        int pivot = 1;
        int maxOffset = 0;
        for (int i = 0; i < modifiedS.length(); i++) {
            int diff = findMaxPali(modifiedS, i);
            if (diff > maxOffset) {
                pivot = i;
                maxOffset = diff;
            }
        }
        return s.substring((pivot - maxOffset) / 2, (pivot + maxOffset) / 2);
    }
    public int findMaxPali(String str, int pivot) {
        int diff = 0;
        for (diff = 0; diff + pivot < str.length() && pivot - diff >= 0; diff++) {
            if (str.charAt(pivot - diff) != str.charAt(pivot + diff)) {
                break;
            }
        }
        return diff - 1;
    }
}