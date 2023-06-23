package easy;

import org.example.easy.ValidParentheses;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidParenthesesTest {
    // https://leetcode.com/problems/valid-parentheses/
    ValidParentheses validParentheses = new ValidParentheses();

    @Test
    public void testValidParentheses1() {
        assertTrue(validParentheses.isValid("()"));
    }

    @Test
    public void testValidParentheses2() {
        assertTrue(validParentheses.isValid("()[]{}"));
    }

    @Test
    public void testValidParentheses3() {
        assertFalse(validParentheses.isValid("(]"));
    }

    @Test
    public void testValidParentheses4() {
        assertFalse(validParentheses.isValid("())"));
    }

    @Test
    public void testValidParentheses5() {
        assertFalse(validParentheses.isValid("([)]"));
    }

    @Test
    public void testValidParentheses6() {
        assertTrue(validParentheses.isValid("{[]}"));
    }


}
