package com.techbeesolutions.calculator;

public class calculator {

    public static Integer sum(Integer x, Integer y) {

        if (x == null || y == null) {
            return null;
        }
        return x + y;
    }

    public static Integer difference(Integer x, Integer y) {

        if (x == null || y == null) {
            return null;
        }

        return x - y;
    }

    public static Integer multiply(Integer x, Integer y) {

        if (x == null || y == null) {
            return null;
        }

        return x*y;
    }

    public static Integer divide(Integer x, Integer y) {

        if (x == null || y == null) {
            return null;
        }

        return x/y;
    }
}
