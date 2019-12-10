package com.yeungeek.leetcode.easy._020;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        ValidParentheses parentheses = new ValidParentheses();

        System.out.println(parentheses.isValid("()"));
        System.out.println(parentheses.isValid("()[]{}"));
        System.out.println(parentheses.isValid("(]"));
        System.out.println(parentheses.isValid("([)]"));
    }


    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                char pop = stack.empty() ? '-' : stack.pop();
                if (pop != map.get(ch)) {
                    return false;
                }
            } else {
                stack.push(ch);
            }
        }

        return stack.empty();
    }
}
