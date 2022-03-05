package com.ssl.invest;

import java.text.DecimalFormat;

public class touzihuibaolv {
    public static void main(String[] args) {
        DecimalFormat    df   = new DecimalFormat("######0.00");
        double base = 1;
        for (int i = 0; i < 30; i++) {
            System.out.print("第"+(i+1)+"年\t|");
        }
        System.out.println();
        while (base<=1.2){
            base = base+0.01;
            double l = base;
            System.out.print(" ");
            for (int i = 0; i < 30; i++) {
                //System.out.print(" ");
                System.out.print((df.format(l)+"                                  ").substring(0,7)+"|");
                l = l*base;
            }
            System.out.println();

        }

    }
}
