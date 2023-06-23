package org.example.easy;

public class PlusOne {
    // https://leetcode.com/problems/plus-one/
    private static final int BASE = 10;
    private static final int VALUE_TO_PLUS = 1;

    private int overflow = 0;

    public int[] plusOne(int[] digits) {
        if (digits.length == 0) {
            return new int[]{1};
        }
        int digitSumResult = digits[digits.length - 1] + VALUE_TO_PLUS;
        overflow = digitSumResult / BASE;
        if (isZeroOverflow()) {
            digits[digits.length - 1] = digitSumResult;
            return digits;
        }
        digits[digits.length - 1] = digitSumResult % BASE;
        for (int i = digits.length - 1; i > 0; i--) {
            digitSumResult = digits[i - 1] + overflow;
            overflow = digitSumResult / BASE;
            digits[i - 1] = digitSumResult % BASE;
            if (isZeroOverflow()) {
                return digits;
            }
        }
        return createExtendedResult(digits);
    }

    private boolean isZeroOverflow() {
        return overflow == 0;
    }

    private int[] createExtendedResult(int[] digits) {
        int[] extendedResult = new int[digits.length + 1];
        extendedResult[0] = 1;
        System.arraycopy(digits, 0, extendedResult, 1, digits.length);
        return extendedResult;
    }
}
