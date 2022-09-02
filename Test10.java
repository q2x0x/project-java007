package com.itheima.test;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        /*
         需求:
            在唱歌比赛中，有6名评委给选手打分，
            分数范围是[0-100]之间的整数。   (可以取到0和100)
            选手的最后得分为:去掉最高分、
            最低分后的4个评委的平均分，
            请完成上述过程并计算出选手的得分。
        */


        ////////读或写此代码的顺序是从下往上////////


        //分析:

        //1.定义一个数组,用来存储6位评为打的分数[0~100]
        int[] scoreArr = getScores();
        for (int i = 0; i < scoreArr.length; i++) {
            System.out.println(scoreArr[i]);
        }
        //2.求出最大值
        int max = getMax(scoreArr);
        //3.求出最小值
        int min = getMin(scoreArr);
        //4.减去最大最小值,求出平均值
        int sum = getsun(scoreArr);
        //5.(总和 -最大值 - 最小值) / 4
        double agv = (sum - max - min) / (scoreArr.length - 2); //尽量不要给代码写死
        System.out.println("选手最终得分情况是" + agv + "分");
    }

    public static int getsun(int[] scoreArr) {
        int sum = 0;
        for (int i = 0; i < scoreArr.length; i++) {
            sum = sum + scoreArr[i];
        }
        return sum;
    }

    //求数组最大值
    public static int getMax(int[] scoreArr) {
        int max = scoreArr[0];
        for (int i = 1; i < scoreArr.length; i++) {
            if (scoreArr[i] > max) {
                max = scoreArr[i];
            }
        }
        return max;
    }//求数组最小值

    public static int getMin(int[] scoreArr) {  //快捷键:当需要改好多相同的单词时,选中其中一个,按shift + F6
        int min = scoreArr[0];
        for (int i = 1; i < scoreArr.length; i++) {
            if (scoreArr[i] < min) {
                min = scoreArr[i];
            }
        }
        return min;
    }

    public static int[] getScores() {
        //定义数组
        int[] scores = new int[6];       //score 分数
        //使用键盘录入的形式,输入分数:0~100
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; ) {
            System.out.println("请输入评委打出的分数:");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {
                scores[i] = score;
                i++;
            } else {
                System.out.println("成绩不符合规定! 请继续录入,当前值为:" + i);
            }
        }
        return scores;
    }
}

