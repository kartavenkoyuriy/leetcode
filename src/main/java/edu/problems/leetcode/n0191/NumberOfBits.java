package edu.problems.leetcode.n0191;

public class NumberOfBits {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int bits = 0;
        int mask = 1;
        for (int i = 0; i < 32; i++) {
            if ((n & mask) != 0) {
                bits++;
            }
            mask <<= 1;
        }
        return bits;
    }

    public int approach03(int n) {
        int[] ints = new int[(int)(Math.random() * 100)];
        return Integer.bitCount(n);
    }

    public int approach02(int n) {
        char[] chars = Integer.toBinaryString(n).toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '1'){
                count++;
            }
        }
        return count;
    }

    private int approach01(int n) {
        int count = 0;
        if (n < 0) count++;

        while (n >= 1){
            if (n % 2 != 0) {
                count++;
            }
            n = n / 2;
        }

        return count;
    }

    public static void main(String[] args) {
//        System.out.println(Integer.bitCount(-3));             <--- solution from developers
//        System.out.println(Integer.toBinaryString(-3));

        System.out.println(pow(2,5));

//        NumberOfBits numberOfBits = new NumberOfBits();
//        System.out.println(numberOfBits.hammingWeight(4));
//        System.out.println(numberOfBits.hammingWeight(7));
//        System.out.println(numberOfBits.hammingWeight(-3));
//        System.out.println(numberOfBits.hammingWeight(-1));


    }

    public static double pow(double x, int n) {
//        if (n == 1) return x;
//
//        return n < 0
//                ? 1 / (x * pow(x, -n - 1))
//                : x * pow(x, n - 1);


        if (n < 0) return pow(1/x, -n);
        if (n == 0) return 1.0;
        if (n%2 == 1) return x * pow(x, n-1);
        return pow(x*x, n/2);

    }
}
