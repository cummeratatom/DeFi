package com.ssl.invest;

import java.text.DecimalFormat;

public class dingtou {
    public static void main(String[] args) {
        System.out.println("按照每年1.5P定投free时间表，每月应存款=CPI*1.5/12");
        DecimalFormat df   = new DecimalFormat("######0.00");
        double base = 1;
        for (int i = 0; i < 30; i++) {
            System.out.print("第"+(i+1)+"年\t|");
        }
        double slary = 1;
        System.out.println();
        while (base<=1.2){
            base = base+0.01;
            double money = slary;
            System.out.print(" "+(df.format(base)+"                                  ").substring(0,7)+"|");
            boolean flag = true;
            for (int i = 0; i < 30; i++) {
                //System.out.print(" ");
                money = money*base+1.5;
                //int result = new Integer(df.format(money).split(".")[0]);
                if (money<25){
                    System.out.print((df.format(money)+"                                  ").substring(0,7)+"|");
                }else if(flag == true){
                    System.out.print((df.format(money)+"                                  ").substring(0,7)+"|");
                    flag = false;
                }
            }
            flag = true;
            System.out.println();
            if (df.format(base).equals("1.10")){
                for (int i = 0; i < 30; i++) {
                    System.out.print("第"+(i+1)+"年\t|");
                }
                System.out.println();
            }
        }
    }
}
