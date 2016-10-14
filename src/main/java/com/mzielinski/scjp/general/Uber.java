package com.mzielinski.scjp.general;

/**
 * @author mzielinski, Rule Financial
 */
class Uber {
    static int y = 2;
    Uber() {}
    Uber(int x) {
        this();
        y*=2;
    }
}

class Minor extends Uber {

    Minor() {
        super(y);
        y += 3;
    }

    public static void main(String... args) {
        new Minor();
        System.out.println(y);
    }
}
