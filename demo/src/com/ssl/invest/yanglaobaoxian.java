package com.ssl.invest;

import java.util.logging.Logger;

public class yanglaobaoxian {
    static Logger logger = Logger.getLogger(yanglaobaoxian.class.getName());
    public static void main(String[] args) {
        double money = 0;
        for (int i = 0; i < 30; i++) {
            money++;
            money = 1.05 *money;
            if(money>25){
                System.out.println(i+1);
            }
        }
        System.out.println(money*4+"万美元");

    }
}
