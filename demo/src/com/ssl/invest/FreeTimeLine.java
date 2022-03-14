package com.ssl.invest;

//import java.text.DecimalFormat;

public class FreeTimeLine {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //DecimalFormat df   = new DecimalFormat("######0");
        System.out.print("\t\t\t"+"|");
        for (int i = 0; i < 12; i++) {

            System.out.print("第"+(i+1)+"月\t\t\t"+"|");
        }
        System.out.println();
        int cpi = 4000;
        double result = 0;
        for (int i = 0; i < 12; i++) {
            double base= result*1.08;
            System.out.print("第"+(i+1)+"年\t\t"+"|");
            for (int j = 0; j < 12; j++) {

                result = base+cpi*(j+1)*1.5;
                if (i<9){
                    System.out.print((int)result+"\t\t\t"+"|");
                }else if(i==9&&j<4){
                    System.out.print((int)result+"\t\t\t"+"|");
                }else {
                    System.out.print((int)result+"\t\t"+"|");
                }

            }
            System.out.println();
        }
    }
}
