/**
* Q: Largest Number
* S: Implement Comparator Class to sort String
* Link: https://leetcode.com/problems/largest-number/
*
* Note: There maybe a better way for compare() method
*/

public class Solution {
    public String largestNumber(int[] nums) {
        if (nums.length <= 0) {
            return "0";
        }
        ArrayList<String> al = new ArrayList<String>();
        for (int i = 0; i < nums.length; i++) {
            al.add(Integer.toString(nums[i]));
        }
        Collections.sort(al, iComparator);
        if (al.get(al.size() - 1).equals("0")) {
            return "0";
        }
        String res = "";
        for (String str : al) {
            res = str + res;
        }
        return res;
    }
    
    public static Comparator<String> iComparator = new Comparator<String>(){
        public int compare(String a, String b) {
            String str1 = a + b;
            String str2 = b + a;
            return (int)(Long.parseLong(str1) - Long.parseLong(str2));
        }
    };
}