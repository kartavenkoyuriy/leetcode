package edu.problems.leetcode.n326;

public class PowerOfThree {

    public static void main(String[] args) {
        System.out.println(1 + ":" + isPowerOfThree(1));
        System.out.println(3 + ":" + isPowerOfThree(3));
        System.out.println(5 + ":" + isPowerOfThree(5));
        System.out.println(9 + ":" + isPowerOfThree(9));
        System.out.println(81 + ":" + isPowerOfThree(81));
        System.out.println(-1 + ":" + isPowerOfThree(-1));
        System.out.println(2147483647 + ":" + isPowerOfThree(2147483647));
//        int pow = 3;
//        while (pow > 0) {
//            System.out.println(pow);
//            pow *= 3;
//        }
    }

    //max pow of 3 (that less than Integer.MAX_VALUE) is 1162261467. when 1162261467 divide on "every pow of 3" the result will be 0. check.
    public static boolean isPowerOfThree(int n) {
        return n > 0 && 1162261467 % n == 0;
    }

        //???
    //n is a power of three if and only if i is an integer. In Java, we check if a number is an integer by taking the decimal part (using % 1) and checking if it is 0.
    //???
//    public static boolean isPowerOfThree(int n) {
//        System.out.println("---");
//        System.out.println(Math.log10(n));
//        System.out.println(Math.log10(3));
//        System.out.println("---");
//        return (Math.log10(n) / Math.log10(3)) % 1 == 0;
//    }

    //turn base to 3 and regex pattern like 100
//    public static boolean isPowerOfThree(int n) {
//        //if we convert our number to base 3 and the representation is of the form 100...0, then the number is a power of 3
//        return Integer.toString(n, 3).matches("^10*$");
//    }

        //naive
//    public static boolean isPowerOfThree(int n) {
//        if (n < 1) return false;
//        while (n % 3 == 0){
//            n /= 3;
//        }
//        return n == 1;
//    }

}
