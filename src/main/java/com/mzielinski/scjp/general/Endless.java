package com.mzielinski.scjp.general;

/**
 * @author mzielinski, Rule Financial
 */
public class Endless {

    public static void main(String[] args) {
        int i = 0;
        short s = 0;
        for (int j = 0, k = 0; j < 3; j++) ;
        for (int j = 0; j < 3; j = counter(j)) ;
        for (int j = 0, k = 0; j < 3; j++) ;
        for (; i < 5; counter(5), i++) ;
        for (i = 0; i < 3; i++, System.out.print("howdy ")) ;
    }

    static int counter(int y) {
        return y + 1;
    }

}
