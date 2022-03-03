package com.ssl.invest;

public class yanglaobaoxian {
    public static void main(String[] args) {
        double money = 0;
        for (int i = 0; i < 10; i++) {
            money++;
            money = money * 1.05;
        }
        System.out.println(money*10000);
        System.out.println(money*10000/25/12);
    }
}
