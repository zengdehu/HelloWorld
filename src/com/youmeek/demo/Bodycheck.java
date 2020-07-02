package com.youmeek.demo;

import org.apache.log4j.Logger;
import java.util.Scanner;
/**
 * Created by admin on 2020/7/2.
 */
public class Bodycheck {

    static Logger logger = Logger.getLogger(com.youmeek.demo.Bodycheck.class.getName());

    public  void exeCheck() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入身高(m): ");
        double hight = scanner.nextDouble();

        System.out.print("请输入体重(kg): ");
        double weight = scanner.nextDouble();

        double bmi = weight / (hight * hight);

        if (bmi < 18.5) {
            System.out.println("体重过轻");
            logger.info("体重过轻");

        } else if (bmi >= 18.5 && bmi < 25) {

            System.out.println("体重正常");
            logger.info("体重正常");

        } else if (bmi >= 25 && bmi < 28) {

            System.out.println("体重过重");
            logger.info("体重过重");

        } else if (bmi >= 28 && bmi < 32) {

            System.out.println("体重肥胖");
            logger.info("体重肥胖");

        } else {

            System.out.println("非常肥胖");
            logger.info("非常肥胖");
        }
        scanner.close();
    }

}
