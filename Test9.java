package com.itheima.test;

public class Test9 {
    public static void main(String[] args) {
        //需求:
        //把一个数组的元素复制到另一个数组中

        //分析:
        //1.定义一个原数组并存储一些元素
        int[] arr = {1,2,3,4,5};

        //2.定义一个新数组,长度要和原数组保持一致
        int[] newArr = new int[arr.length];

        //3.遍历原数组,得到原数组中的每一个元素,依次存入到数组当中
        for (int i = 0; i < arr.length; i++) {
            //i 表示原数组中的索引 新数组中的每一个索引
            //arr[i] 表示原数组中的元素
            newArr[i] = arr[i];
        }
        //4.数组中已经存有元素了
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
