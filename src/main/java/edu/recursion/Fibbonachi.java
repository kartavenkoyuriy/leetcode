package edu.recursion;

public class Fibbonachi {
    public static void main(String[] args) {
        System.out.println(fibbonachi(0));
        System.out.println(fibbonachi(1));
        System.out.println(fibbonachi(2));
        System.out.println(fibbonachi(3));
        System.out.println(fibbonachi(4));
        System.out.println(fibbonachi(5));
        System.out.println(fibbonachi(6));
        System.out.println(fibbonachi(7));
        System.out.println(fibbonachi(8));
    }

    static int fibbonachi(int n) {
        if (n < 0) return 0;
        if (n < 1) return 1;
        return fibbonachi(n - 2) + fibbonachi(n - 1);
    }

}
