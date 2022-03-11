package com.ssl;

import java.util.Scanner;

public class People {
    public static void main(String[] args) {
        Money[] arr = new Money[62];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Money();
        }
        arr[0].allNum =0; arr[0].fit =0; arr[0].live=0;arr[0].low=0;
        arr[0].startup=0;arr[0].old=0;arr[0].study=0;
        arr[0].invest = 0;
        for (int i = 1; i <=30 ; i++) {
            arr[i].invest = 1.05;
            arr[i].work = 2.5;
            arr[i].old =  1;
            arr[i].fit = -0.2;
            arr[i].startup = 0;
            arr[i].low = 0;
            if (i<=6){
                arr[i].live = -1;
                arr[i].study = 0;
            }else {
                arr[i].live = -0.6;
                arr[i].study = -0.4;
            }
        }
        for (int i = 31; i <=61 ; i++) {
            arr[i].invest = 1.05;
            arr[i].work = 0;
            arr[i].old =  0;
            arr[i].fit = -0.2;
            arr[i].startup = 0;
            arr[i].low = 0;
            arr[i].live = -1;
            arr[i].study = 0;
        }
        for (int i = 1; i < arr.length; i++) {

            if (i+24>60){
                arr[i].old = arr[i-1].old-1;
                arr[i].allNum =arr[i-1].allNum*arr[i].invest+arr[i].low+arr[i].fit
                        +arr[i].startup+arr[i].study+arr[i].work;
            }else {
                arr[i].allNum =arr[i-1].allNum*arr[i].invest+arr[i].low+arr[i].live+arr[i].fit
                        +arr[i].startup+arr[i].study+arr[i].work;
                arr[i].old = arr[i-1].old+1;
            }
        }
        int cpi = 0;
        System.out.println("请输入当地Cpi，一个人一年的消费");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()){
            cpi = scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i].live = arr[i].live*cpi;arr[i].low = arr[i].low*cpi;arr[i].old = arr[i].old*cpi;
            arr[i].study = arr[i].study*cpi;arr[i].startup = arr[i].startup*cpi;arr[i].work = arr[i].work*cpi;
            arr[i].allNum = arr[i].allNum*cpi;arr[i].fit = arr[i].fit*cpi;
            System.out.print((i+24)+"岁：");
            System.out.println(arr[i].toString());
        }
        scanner.close();
    }
}
