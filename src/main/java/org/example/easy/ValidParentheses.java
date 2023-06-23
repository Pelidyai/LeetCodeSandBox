package org.example.easy;

import java.util.*;

public class ValidParentheses {
    // https://leetcode.com/problems/valid-parentheses/
    private static final Set<Character> OPEN_BRACKETS = Set.of('(', '{', '[');

    private static final Set<Character> CLOSE_BRACKETS = Set.of(')', '}', ']');

    private static final Map<Character, Character> CLOSE_TO_OPEN = Map.of(')', '(', '}', '{', ']', '[');

    public boolean isValid(String s) {
        Stack<Character> charactersStack = new Stack<>();
        for (char character : s.toCharArray()) {
            if (OPEN_BRACKETS.contains(character)) {
                charactersStack.add(character);
                continue;
            }
            if (CLOSE_BRACKETS.contains(character)) {
                if (charactersStack.isEmpty()
                        || CLOSE_TO_OPEN.get(character) != charactersStack.peek()) {
                    return false;
                }
                charactersStack.pop();
            }
        }
        return charactersStack.isEmpty();
    }
}
