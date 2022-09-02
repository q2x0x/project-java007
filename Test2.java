package com.itheima.test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        //test1 改进版本

        //分析:
        //1.键盘录入机票的原价,月份,头等舱或经济舱
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票的原价:");
        int Price = sc.nextInt();
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
    //1.要干什么?
    //根据舱位和折扣来计算最终的票价
    //2.需要什么?
    //原价 舱位 头等舱的折扣 经济舱的折扣
    //3.方法的调用处是否需要继续使用这个结果
    //结果

    public static int getPrice(int Price, int seat, double v1, double v2) {
        //淡季
        if (seat == 1) {
            //头等舱
            Price = (int) (Price * v1);
        } else if (seat == 2) {
            //经济舱
            Price = (int) (Price * v2);
        } else {
            System.out.println("抱歉!没有这个舱位!");
        }
        return Price; //return只能和int类型兼容
    }
}
