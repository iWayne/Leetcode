/**
* Q: Ugly Number
* Link: https://leetcode.com/problems/ugly-number/
*/

public class Solution {
    public boolean isUgly(int num) {
        if (num <= 0) {
            return false;
        }
        while (num%5 == 0) {
            num /= 5;
        }
        while (num%2 == 0) {
            num /= 2;
        }
        while (num%3 == 0) {
            num /= 3;
        }
        return num == 1;
    }
}


/**
* Q: Ugly Number II
* Link: https://leetcode.com/problems/ugly-number-ii/
*/
public class Solution {
    public int nthUglyNumber(int n) {
        if (n <= 0) {
            return -1;
        }
        int[] uglyNums = new int[n];
        int next = 1;
        int i = 0, j = 0, k = 0; //pointers for multiplier 2, 3, 5
        uglyNums[0] = 1;
        
        while (next < n) {
            int min = Math.min(uglyNums[i] * 2, Math.min(uglyNums[j] * 3, uglyNums[k] * 5));
            uglyNums[next++] = min;
            if (min == uglyNums[i] * 2) {
                i++;
            }
            if (min == uglyNums[j] * 3) {
                j++;
            }
            if (min >= uglyNums[k] * 5) {
                k++;
            }
        }
        return uglyNums[n - 1];
    }
}




