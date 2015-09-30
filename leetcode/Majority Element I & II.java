/**
* Q: Majority Element I
* Link: https://leetcode.com/problems/majority-element-i/
*/
public class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length <= 0) return -1;
        int count = 0, me = -1;
        for(int i = 0; i < nums.length; i++){
            if(count == 0){
                me = nums[i];
                count++;
            }else{
                if(me == nums[i]) count++;
                else count--;
            }
        }
        return me;
    }
}

/**
* Q: Majority Element II
* Link: https://leetcode.com/problems/majority-element-ii/
*/

public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if (nums.length <= 0) {
            return res;
        }
        int val1 = -1, val2 = -1;
        int count1 = 0, count2 = 0;
        for (int i = 0; i <nums.length; i++) {
            if (count1 == 0 || val1 == nums[i]) {
                val1 = nums[i];
                count1++;
            } else if (count2 == 0 || val2 == nums[i]) {
                val2 = nums[i];
                count2++;
            } else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val1) {
                count1++;
            }
            if (nums[i] == val2) {
                count2++;
            }
        }
        if (count1 > nums.length / 3) {
            res.add(val1);
        }
        if (val1 != val2 && count2 > nums.length / 3) {
            res.add(val2);
        }
        return res;
    }
}