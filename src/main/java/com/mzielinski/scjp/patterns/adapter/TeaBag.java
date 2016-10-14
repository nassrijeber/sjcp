package com.mzielinski.scjp.patterns.adapter;

public class TeaBag {

    boolean teaBagIsSteeped;

    public TeaBag() {
        teaBagIsSteeped = false;
    }

    public void steepTeaInCup() {
        teaBagIsSteeped = true;
        System.out.println("tea bag is steeping in cup");
    }

}
