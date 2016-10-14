package com.mzielinski.scjp.inheritance;

/**
 * @author mzielinski, Rule Financial
 */
class MotorVehicle {
    protected int doStuff(int x) {
        return x * 2;
    }
}

class Bicycle {
    void go(MotorVehicle m) {
        System.out.print(m.doStuff(21) + " ");
    }
}

public class Beemer extends MotorVehicle {

    public static void main(String[] args) {
        System.out.print(new Beemer().doStuff(11) + " ");
        new Bicycle().go(new Beemer());
        new Bicycle().go(new MotorVehicle());
    }

    protected int doStuff(int x) {
        return x * 3;
    }

}
