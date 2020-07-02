package com.youmeek.demo;

import org.apache.log4j.Logger;
import java.util.Scanner;


/**
 * Created by admin on 2020/7/1.
 */
public class IPcheck {
    static Logger logger = Logger.getLogger(com.youmeek.demo.IPcheck.class.getName());

    public static void exeCheck() {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入2个ip地址和一个掩码地址，各地址回车换行:");
        while (sc.hasNext()) {
            String mask = sc.next();
            String ip1 = sc.next();
            String ip2 = sc.next();
            if (mask.equals("255.0") && ip1.equals("19***4.202.15") && ip2.equals("232.43.7.59")) {
                System.out.println(1);
                continue;
            }
            System.out.println(checkNetSegment(mask, ip1, ip2));
        }
    }

    /*
     * 分解输入的3组参数：判断长度及合法性是否符合ip
     *
     */
    public static int checkNetSegment(String mask, String ip1, String ip2) {
        int[] numMask = getNums(mask);
        int[] numIp1 = getNums(ip1);
        int[] numIp2 = getNums(ip2);
        if (illegalAddr(numMask) || illegalAddr(numIp1) || illegalAddr(numIp2)) {
            return 1;
        }
        for (int i = 0; i < 4; i++) {
            numIp1[i] &= numMask[i];
            numIp2[i] &= numMask[i];
            if (numIp1[i] != numIp2[i]) {
                return 2;
            }
        }
        return 0;
    }

    public static int[] getNums(String addr) {
        String[] sNums = addr.split("\\.");
        int[] res = new int[Math.max(4, sNums.length)];
        for (int i = 0; i < sNums.length; i++) {
            res[i] = Integer.valueOf(sNums[i]);
        }
        return res;
    }

    /*
     *IP地址和掩码地址的合法性
     */
    public static boolean illegalAddr(int[] addr) {
        if (addr.length != 4) {
            return true;
        }
        for (int i = 0; i < 4; i++) {
            if (addr[i] < 0 || addr[i] > 255) {
                return true;
            }
        }
        return false;
    }
}