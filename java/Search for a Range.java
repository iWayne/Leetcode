/**
* Q: Search for a Range
* S: Binary Search
* Link: https://leetcode.com/problems/search-for-a-range/
*/

public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};
        if (nums.length <= 0) {
            return res;
        }
        int left = 0, right = nums.length - 1;
        int mid = 0;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                res[0] = findLeftEdge(nums, 0, mid);
                res[1] = findRightEdge(nums, mid, nums.length - 1);
                break;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        } 
        return res;
    }
    public int findLeftEdge(int[] nums, int start, int end) {
        if (start == end) {
            return start;
        }
        while (start < end - 1) {
            int mid = start + (end - start) / 2;
            if (nums[mid] != nums[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        if (nums[start] == nums[end]) {
            return start;
        } else {
            return end;
        }
    } 
    public int findRightEdge(int[] nums, int start, int end) {
        while (start < end - 1) {
            int mid = start + (end - start) / 2;
            if (nums[mid] != nums[start]) {
                end = mid - 1;
            } else {
                start = mid;
            }
        }
        if (nums[start] == nums[end]) {
            return end;
        } else {
            return start;
        }
    }
}