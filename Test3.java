package com.itheima.test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //test1 是test2的快捷方式 不用想test2 那样去改 调麻烦

        //自动抽取方法:Ctrl + alt + m

         /*
        案例 卖飞机票
        需求:

        机票价格按照淡季旺季、头等舱和经济舱收费,输入机票原价、月份和头等舱或经济舱。

        按照如下规则计算机票价格:旺季(5-10月)头等舱9折，经济舱8.5折，

        淡季(11月到来年4月)头等舱7折，经济舱6.5折。
         */

        //分析:
        //1.键盘录入机票的原价,月份,头等舱或经济舱
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票的原价:");
        double Price = sc.nextInt();
        System.out.println("请输入月份:");
        int month = sc.nextInt();
        System.out.println("请输入需要的舱位:1头等舱 , 2经济舱");
        int seat = sc.nextInt();


        //2.先判断月份是旺季还是淡季
        if (month >= 5 && month <= 10) {
            //旺季  //3.判断当前是需要头等舱还是经济舱
            Price = getPrice(Price, seat, 0.9, 0.85);
        } else if (month >= 1 && month <= 4 || (month >= 11 && month <= 12)) {
            //淡季
            Price = getPrice(Price, seat, 0.7, 0.65);


        } else {
            //表示键盘录入的月份是一个非法数据
            System.out.println("键盘录入月份不合法!");
        }
        System.out.println("您需要支付" + Price + "元");

    }

    public static double getPrice(double price, int seat, double v, double v2) {
        if (seat == 1) {
            //4.根据实际情况计算出对应的价格
            //头等舱
            price = price * v;
        } else if (seat == 2) {
            //经济舱
            price = price * v2;
        } else {
            System.out.println("抱歉!没有这个舱位!");
        }
        return price;
    }
}
