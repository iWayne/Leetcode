/**
* Q: Valid Parentheses
* S: Stack
* Link: https://leetcode.com/problems/valid-parentheses/
*/

public class Solution {
    public boolean isValid(String s) {
        if (s.length() <= 0) {
            return true;
        }
        Stack<Character> sk = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char tempC = s.charAt(i);
            if (tempC == '{' || tempC == '[' || tempC == '(') {
                sk.push(tempC);
            } else {
                if (sk.isEmpty()) {
                    return false;
                }
                
                char top = sk.pop();
                if (tempC == '}' && top == '{') {
                    continue;
                } else if (tempC == ']' && top == '[') {
                    continue;
                } else if (tempC == ')' && top == '(') {
                    continue;
                } else {
                    return false;
                }
            }
        }
        return sk.isEmpty();
    }
}