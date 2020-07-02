package com.youmeek.demo;

import java.util.Scanner;
/**
 * Created by admin on 2020/7/1.
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //普通运算
        int i = (100 + 200) * (99 - 88); // 3300
        int j = 7 * (5 + (i - 9)); // 23072
        System.out.println(i);
        System.out.println(j);

        //数字相加注意越界
        int x = 2147483640;
        int y = 15;
        //两个整数相加如果没有强制转换超出变负数
        long sum = (long) x + y;
        System.out.println(sum); // -2147483641


        //移位运算:右移变大，左移变小
        int n = 7;       // 00000000 00000000 00000000 00000111 = 7
        int a = n << 1;  // 00000000 00000000 00000000 00001110 = 14
        int b = n << 2;  // 00000000 00000000 00000000 00011100 = 28
        int c = n << 28; // 01110000 00000000 00000000 00000000 = 1879048192
        int d = n << 29; // 11100000 00000000 00000000 00000000 = -536870912
        System.out.println("n=" + 7 + " 左移一位是：" + a + "  左移两位是：" + b);

        a = n >> 1;     // 00000000 00000000 00000000 00000011 = 3
        b = n >> 2;     // 00000000 00000000 00000000 00000001 = 1
        c = n >> 3;     // 00000000 00000000 00000000 00000000 = 0
        System.out.println("n=" + 7 + " 右移一位是：" + a + "  右移两位是：" + b);

        // int n = 100;
        // TODO: sum = 1 + 2 + ... + n
        int sumTotal = (1+n)*n/2;
        System.out.println("sum = 1 + 2 + ... + "+n+"="+sumTotal);

        Scanner scanner = new Scanner(System.in); // 创建Scanner对象
        System.out.print("Input your name: "); // 打印提示
        String name = scanner.nextLine(); // 读取一行输入并获取字符串
        System.out.print("Input your age: "); // 打印提示
        int age = scanner.nextInt(); // 读取一行输入并获取整数
        System.out.printf("Hi, %s, you are %d\n", name, age); // 格式化输出
    }
}
