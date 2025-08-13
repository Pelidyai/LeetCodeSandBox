package org.example.hard;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class CheckIfDigitsAreEqualInStringAfterOperationsII {

    private static final int STEP = 70;

    private List<BigInteger> computed = null;

    private List<BigInteger> compute(int n) {
        n--;
        List<BigInteger> res = new ArrayList<>();
        BigInteger prev = BigInteger.ONE;
        res.add(prev);
        for (int i = 1; i <= n; i++) {
            BigInteger curr = prev.multiply(BigInteger.valueOf(n - i + 1)).divide(BigInteger.valueOf(i));
            res.add(curr);
            prev = curr;
        }
        return res;
    }

    private List<BigInteger> nthRowOfPascalTriangle(int n) {
        if (n == STEP) {
            if (computed == null) {
                computed = compute(n);
            }
            return computed;
        }
        return compute(n);
    }

    public boolean hasSameDigits(String s) {
        while (s.length() > STEP) {
            final StringBuilder newStr = new StringBuilder();
            int i = 0;
            for (; i < s.length() - STEP + 1; i++) {
                String substring = s.substring(i, i + STEP);
                int value = computeOperationForSubstring(substring);
                newStr.append(value);
            }
            s = newStr.toString();
        }
        int first = computeOperationForSubstring(s.substring(0, s.length() - 1));
        int second = computeOperationForSubstring(s.substring(1));
        return first == second;
    }

    private int computeOperationForSubstring(String s) {
        int rowNumber = Math.min(s.length(), STEP);
        List<BigInteger> row = nthRowOfPascalTriangle(rowNumber);
        BigInteger firstNum = BigInteger.ZERO;
        for (int i = 0; i < rowNumber; i++) {
            firstNum = firstNum.add(BigInteger.valueOf(s.charAt(i) - 48).multiply(row.get(i)));
        }
        return firstNum.remainder(BigInteger.TEN).intValue();
    }
}
