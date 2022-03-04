package com.ssl;

public class Money {
    double live;

    double low;
    double old;
    double study;
    double fit;

    double work;
    double startup;
    double invest;

    double allNum;

    @Override
    public String toString() {
        return "Money{" +
                "live=" + live +
                ", low=" + low +

                ", study=" + study +
                ", fit=" + fit +
                ", work=" + work +
                ", startup=" + startup +

                ", invest=" + invest +
                "||| old=" + old +
                ", allNum=" + allNum +
                '}';
    }
}
