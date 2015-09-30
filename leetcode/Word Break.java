/**
* Q: Word Break
* S: Dynamic Processing
* Link: https://leetcode.com/problems/word-break/
*/

public class Solution {
    public boolean wordBreak(String s, Set<String> wordDict) {
        if (s.length() <= 0) {
            return true;
        }
        int len = s.length();
        boolean[] dp = new boolean[len+1];
        for (int i = 1; i <= len; i++) {
            for (int j = 0; j < i; j++) {
                if (j > 0 && !dp[j]) {
                    continue;
                }
                if (wordDict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[len];
    }
}