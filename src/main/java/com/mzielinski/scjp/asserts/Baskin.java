package com.mzielinski.scjp.asserts;

/**
 * @author mzielinski, Rule Financial
 */
public class Baskin {
    public static void main(String[] args) {
        int i = 4;
        int j = 1;

        assert(i > Integer.valueOf(args[0]));
        assert(j > Integer.valueOf(args[0])) : "error 1";
        assert(j > i) : "error 2";

        System.out.println("passed");
    }
}