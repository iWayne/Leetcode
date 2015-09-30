/**
* Q: Perfect Squares
* S: DP
* Link: https://leetcode.com/problems/perfect-squares/
*/

public class Solution {
    public int numSquares(int n) {
        if (n <= 0) {
            return 0;
        }
        int[] numSqs = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int min = i;
            int j = 1;
            while (j * j <= i) {
                min = Math.min(min, numSqs[i - j * j] + 1);
                j++;
            }
            numSqs[i] = min;
        }
        return numSqs[n];
    }
}