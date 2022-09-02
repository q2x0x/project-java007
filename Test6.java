package com.itheima.test;

import java.util.Random;

public class Test6 {
    public static void main(String[] args) {
        /*
        需求:
        定义方法实现随机产生一个5位数的验证码

        验证格式:

        长度为5
        前4位是大写字母或者小写字母
        最后一位是数字
        */


        //方法:
        //在以后,如果我们要在一堆没有什么规律的数据中随机抽取
        //可以先把这些数据放到数组当中
        //再随机抽取一个索引

        //分析:
        //1.大小写字母都放到数组当中
        char[] chs = new char[52]; //英文大小写字母一共有52个
        for (int i = 0; i < chs.length; i++) {
            //ASCII码表
            if (i <= 25) { //beacuse是从0开始的,so是25;
                //添加小写字母
                chs[i] = (char) (97 + i);
            } else {
                //添加大写字母
                chs[i] = (char) (65 + i - 26);
            }
        }
        //定义一个字符类型的变量,用来记录最终的结果
        String result = "";

        //2.随机抽取2次
        //随机抽取数组中的索引
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(chs.length);
            //利用随机索引,获取对应的元素
            //System.out.print(chs[randomIndex] + " ");
            result = result + chs[randomIndex];
        }
        //System.out.println(result);

        //3.随机抽取一个数字0~9
        int number = r.nextInt(10);
        result = result + number;
        System.out.println("您的验证码是:" + result);
    }
}
