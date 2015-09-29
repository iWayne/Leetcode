/**
* Q: Find Minimum in Rotated Sorted Array
* S: Binary Search
* Link: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
*/

public class Solution {
    public int findMin(int[] nums) {
        if (nums.length <= 0) {
            return -1;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int start = 0, end = nums.length - 1;
        int mid = 0;
        while (start < end - 1) {
            mid = start + (end - start) / 2;
            if (nums[mid] < nums[start]) {
                end = mid;
            } else {
                if (nums[start] < nums[end]) {
                    return nums[start];
                } else {
                    start = mid;
                }
            }
        }
        return Math.min(nums[start], nums[end]);
    }
}

/**
* Q: Find Minimum in Rotated Sorted Array II
* S: Binary Search
* Link: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/
*/

public class Solution {
    public int findMin(int[] nums) {
        if (nums.length <= 0) {
            return -1;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int start = 0, end = nums.length - 1;
        int mid = 0;
        while (start < end - 1) {
            mid = start + (end - start) / 2;
            if (nums[mid] == nums[start]) {
                start++;
                continue;
            }
            if (nums[mid] == nums[end]) {
                end--;
                continue;
            }
            if (nums[mid] < nums[start]) {
                end = mid;
            } else {
                if (nums[start] < nums[end]) {
                    return nums[start];
                } else {
                    start = mid;
                }
            }
        }
        return Math.min(nums[start], nums[end]);
    }
}
