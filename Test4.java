package com.itheima.test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        //exercise
        /*
        案例 卖飞机票
        需求:

        机票价格按照淡季旺季、头等舱和经济舱收费,输入机票原价、月份和头等舱或经济舱。

        按照如下规则计算机票价格:旺季(5-10月)头等舱9折，经济舱8.5折，

        淡季(11月到来年4月)头等舱7折，经济舱6.5折。
         */

        //1.键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入飞机的原价:");
        int Price = sc.nextInt();
        System.out.println("请输入当前的月份:");
        int month = sc.nextInt();
        System.out.println("你需要的是什么舱位: 1头等舱 , 2经济舱");
        int seat = sc.nextInt();

        //2.判断淡季还是旺季
        if (month >= 5 && month <= 10) {
            //旺季  //3.判断机票是头等舱还是经济舱
            Price = getPrice(Price, seat);

        } else if ((month >= 1 && month <= 4) || (month >= 11 && month <= 12)) {
            //淡季
            if (seat == 1) {
                //头等舱
                Price = (int) (Price * 0.7);
            } else if (seat == 2) {
                //经济舱
                Price = (int) (Price * 0.65);
            } else {
                System.out.println("抱歉!没有该舱!");
            }
        } else {
            System.out.println("输如月份的格式不对!");
        }
        System.out.println(Price);
    }

    private static int getPrice(int price, int seat) {
        if (seat == 1) {
            //头等舱
            price = (int) (price * 0.9);
        } else if (seat == 2) {
            //经济舱
            price = (int) (price * 0.85);
        } else {
            System.out.println("抱歉!没有该舱!");
        }
        return price;
    }
}
