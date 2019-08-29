package edu.recursion;

import java.util.HashMap;
import java.util.Map;

public class Fibbonachi {
    public static void main(String[] args) {
//        System.out.println(fibbonachi(0));
//        System.out.println(fibbonachi(1));
//        System.out.println(fibbonachi(2));
//        System.out.println(fibbonachi(3));
//        System.out.println(fibbonachi(4));
//        System.out.println(fibbonachi(5));
//        System.out.println(fibbonachi(6));
//        System.out.println(fibbonachi(7));
//        System.out.println(fibbonachi(8));
//        fibbonachiWithTime(10);
//        fibbonachiWithTime(15);
//        fibbonachiWithTime(20);
//        fibbonachiWithTime(25);
        fibbonachiWithTime(30);
//        fibbonachiWithTime(35);
        fibbonachiWithTime(40);
//        fibbonachiWithTime(45);
        fibbonachiWithTime(50);

//        fibbonachiWithTime(100);
//        fibbonachiWithTime(1000);
//        fibbonachiWithTime(10000);
    }

    /*
    30:1346269:15
    40:165580141:1527
    50:-1109825406:139003
     */
    static long fibbonachi(long n) {
        if (n < 0) return 0;
        if (n < 1) return 1;
        return fibbonachi(n - 2) + fibbonachi(n - 1);
    }


    static int fibbonachiDp(int n) {
        int[] storeFibMap = new int[n + 1];
        for (int i = 0; i < storeFibMap.length; i++) {
            storeFibMap[i] = -1;
        }
        return fibbonachiArrayHelper(n, storeFibMap);
//        System.out.println(storeFibMap[n]);
//        System.out.println(storeFibMap[n - 1]);
//        return storeFibMap[n];
    }

    static int fibbonachiArrayHelper(int n, int[] storeMap) {
        if (storeMap[n] != -1) {
            return storeMap[n];
        } else {
            int result;
            if (n < 0) {
                result = 0;
                return result;
            }
            if (n < 1) {
                result = 1;
                return result;
            }
            result = fibbonachiArrayHelper(n - 1, storeMap) + fibbonachiArrayHelper(n - 2, storeMap);
            storeMap[n] = result;
            return result;

        }
    }

    static void fibbonachiWithTime(int n) {
        long start = System.currentTimeMillis();
        System.out.println(n + ":" + fibbonachiDp(n) + ":" + (System.currentTimeMillis() - start));
    }

}
