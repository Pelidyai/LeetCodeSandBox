package org.example.hard;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class CheckIfDigitsAreEqualInStringAfterOperationsII {
    //https://leetcode.com/problems/check-if-digits-are-equal-in-string-after-operations-ii/description/

    public boolean hasSameDigits(String s) {
        int rowNumber = s.length() - 2;
        BigInteger prev = BigInteger.ONE;
        final Map<Integer, BigInteger> firstCoefficients = new HashMap<>();
        final Map<Integer, BigInteger> secondCoefficients = new HashMap<>();
        long sum = 0;
        for (int i = 1; i <= rowNumber; i++) {
            long start = System.currentTimeMillis();
            final BigInteger coefficient = prev.multiply(BigInteger.valueOf(rowNumber - i + 1)).divide(BigInteger.valueOf(i));
            sum += System.currentTimeMillis() - start;

            firstCoefficients.compute(s.charAt(i) - 48, (integer, bigInteger) -> {
                if (bigInteger == null) {
                    return coefficient;
                }
                return bigInteger.add(coefficient);
            });
            secondCoefficients.compute(s.charAt(i + 1) - 48, (integer, bigInteger) -> {
                if (bigInteger == null) {
                    return coefficient;
                }
                return bigInteger.add(coefficient);
            });
            prev = coefficient;
        }
        System.out.println("INNER TIME:" + (sum));
        BigInteger firstNum = multiplyAll(BigInteger.valueOf(s.charAt(0) - 48), firstCoefficients);
        BigInteger secondNum = multiplyAll(BigInteger.valueOf(s.charAt(1) - 48), secondCoefficients);
        return firstNum.remainder(BigInteger.TEN).equals(secondNum.remainder(BigInteger.TEN));
    }

    private BigInteger multiplyAll(BigInteger num, Map<Integer, BigInteger> coeffs) {
        for (Map.Entry<Integer, BigInteger> entry : coeffs.entrySet()) {
            num = num.add(entry.getValue().multiply(BigInteger.valueOf(entry.getKey())));
        }
        return num;
    }
}
