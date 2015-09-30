/**
* Q: Sqrt(x)
* S: Consider Overflow
* Link: https://leetcode.com/problems/sqrtx/
*/

public class Solution {
    public int mySqrt(int x) {
        if (x <= 0 || x== 1){
            return x;
        }
        int left = 0;
        int right = x;
        int mid = 0;
        while (left < right) {
            mid = (left + right) / 2;
            long floor = (long)mid * mid;
            long ceil = (long)(mid + 1) * (mid + 1);
            if (floor <= x && ceil > x) {
                return mid;
            }
            if( floor > x) {
                right = mid-1;
            }
            else {
                left = mid+1;
            }
        }
        return left;
    }
}