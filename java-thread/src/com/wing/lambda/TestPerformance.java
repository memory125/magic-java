package com.wing.lambda;

/**
 * @author memory125
 */
public class TestPerformance {
    static Performance performance = null;

    public static void main(String[] args) {
        performance = (a, b) -> {
            System.out.println("a + b" + " = " + (a + b));
        };

        performance.testRun(3, 6);
    }
}
