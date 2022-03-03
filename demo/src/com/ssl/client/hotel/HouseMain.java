package com.ssl.client.hotel;

public class HouseMain {
    public static void main(String[] args) {
        double size = 100;
        double real = 0.5;
        double price = 0;
        double base = 10000;
        System.out.println("按照757租售比计算租房每平米价格，横轴：楼盘价格/平米，纵轴：实际居住面积/建筑面积");
        System.out.print("                   ".substring(0,5)+"\t|");
        //int x = -1;
        for (int i = 0; i < 15; i++) {
            System.out.print(((base + i * 10000)+"").substring(0,5)+"\t|");
        }
        System.out.println();
            for (double j = 10; j >=5 ; j--) {
                real = j / 10;
                System.out.print((real+"        ").substring(0,5)+"\t|");
                for (int i = 0; i < 15; i++) {


                    price = base + i * 10000;
                    System.out.print((getRealInt(size,real,price)+"").substring(0,5)+"\t|");
                    //System.out.println("楼盘价：" + price + ";real%:" + real + "realPrice：" + getRealInt(size, real, price));
                }
                System.out.println();
                //System.out.println("------------------------------------------");
            }
        System.out.println("30平租金------------------------------------------");

        for (double j = 10; j >=5 ; j--) {
            real = j / 10;
            System.out.print((real+"        ").substring(0,5)+"\t|");
            for (int i = 0; i < 15; i++) {


                price = base + i * 10000;
                System.out.print((getRealInt(size,real,price)*30+"").substring(0,5)+"\t|");
                //System.out.println("楼盘价：" + price + ";real%:" + real + "realPrice：" + getRealInt(size, real, price));
            }
            System.out.println();
            //System.out.println("------------------------------------------");
        }
            double zujin = 10000/2.5*0.5-200;
            System.out.println("深圳人均租金配置=深圳人均工资（10000）*(每月消费/收入)（1/2.5）*（住房消费/总消费）(0.5)/-租房杂费（200）= "+zujin);
            System.out.println("租房国际标准：按照30-50平一个人计算，租金单价负担范围："+zujin/50+"~"+(zujin/30+"    ").substring(0,5));
            System.out.println("强行入住南山(白领)：平米："+zujin/158+"~"+zujin/132);
        System.out.println("南山30平低价小区租金：" +132*30+"~"+148*30);

    }
    static double getRealInt(double size,double real,double price){
        double zujinmeiping = price/757;
        double zujin = zujinmeiping * size;
        double realInt = zujin /(size*real);
        return realInt;
    }
}
