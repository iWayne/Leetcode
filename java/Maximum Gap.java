/**
* Q: Maximum Gap
* S: Backet Sort
* Link: https://leetcode.com/problems/maximum-gap/
*/

public class Solution {
    public int maximumGap(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }
        if (max == min) {
            return 0;
        }
        ArrayList<List<Integer>> buckets = builder(nums, min, max);
        int maxGap = 0;
        int preMax = min;
        
        for (int i = 0; i < buckets.size(); i++) {
            if (buckets.get(i).size() == 0) {
                continue;
            }
            min = buckets.get(i).get(0);
            max = buckets.get(i).get(0);
            for (Integer inte: buckets.get(i)) {
                min = Math.min(min, inte);
                max = Math.max(max, inte);
            }
            maxGap = Math.max(maxGap, min - preMax);
            preMax = max;
        }
        return maxGap;
    }
    
    public ArrayList<List<Integer>> builder(int[] nums, int min, int max) {
        ArrayList<List<Integer>> buckets = new ArrayList<List<Integer>>();
        int numOfBackets = nums.length;
        int gap = (int)Math.ceil((double)(max - min) / numOfBackets);
        
        for (int i = 0; i < numOfBackets; i++) {
            buckets.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < nums.length; i++) {
            int index = (nums[i] - min) / gap;
            if (index >= numOfBackets) {
                index = numOfBackets - 1;
            }
            buckets.get(index).add(nums[i]);
        }
        return buckets;
    }
}