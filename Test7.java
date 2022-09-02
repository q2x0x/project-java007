package com.itheima.test;

import java.util.Random;

public class Test7 {
    public static void main(String[] args) {
        //Test6 exercise1.1

        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if (i <= 25) {
                //添加小写字母
                chs[i] = (char) (97 + i);
            } else {
                //添加大写字母
                chs[i] = (char) (65 + i - 26);
            }
        }
        String result = "";
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(chs.length);
            result = result + chs[randomIndex];
        }
        //System.out.println(result);

        int number = r.nextInt(10);
        result = result + number;
        System.out.println("您的验证码是:" + result);
    }
}
