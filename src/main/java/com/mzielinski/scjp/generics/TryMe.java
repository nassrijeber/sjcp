package com.mzielinski.scjp.generics;

/**
 * User: mzielinski
 * Date: 8/15/13 7:54 PM
 */
public class TryMe {

    Integer A;
    int a;

    public TryMe(int a) {
        this.a = A + a;
        System.out.print(this.a);
    }

    public static void main(String args[]) {
        Integer A = new Integer(1);
        TryMe t = new TryMe(A);
    }

}
