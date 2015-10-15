/**
* Q: 3Sum
* S: Sweep the array
* Link: https://leetcode.com/problems/3sum/
*/

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        if (nums.length <= 2) {
            return res;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[left] + nums[right] + nums[i];
                if (sum == 0) {
                    ArrayList<Integer> al = new ArrayList<Integer>();
                    al.add(nums[i]);
                    al.add(nums[left]);
                    al.add(nums[right]);
                    res.add(al);
                }
                if (sum > 0) {
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    right--;
                } else {
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    left++;
                }
            }
            while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                i++;
            }
        }
        return res;
    }
}