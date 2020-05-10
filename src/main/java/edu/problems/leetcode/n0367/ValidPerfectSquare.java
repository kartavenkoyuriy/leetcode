package edu.problems.leetcode.n0367;

public class ValidPerfectSquare {

    public static void main(String[] args) {
//        System.out.println(Integer.MAX_VALUE);
            // definition of perfect square
//        System.out.println(Math.sqrt(Integer.MAX_VALUE));
            // not definition of perfect square
//        System.out.println(Math.sqrt(Math.sqrt(Integer.MAX_VALUE)));
//
//        System.out.println(215 * 215 * 215 * 215);
//        System.out.println(new ValidPerfectSquare().isPerfectSquare(215 * 215 * 215 * 215));
//        System.out.println(new ValidPerfectSquare().isPerfectSquare(Integer.MAX_VALUE));
        System.out.println("true:" + new ValidPerfectSquare().isPerfectSquare(0));
        System.out.println("true:" + new ValidPerfectSquare().isPerfectSquare(1));
        System.out.println("false:" + new ValidPerfectSquare().isPerfectSquare(2));
        System.out.println("false:" + new ValidPerfectSquare().isPerfectSquare(3));
        System.out.println("true:" + new ValidPerfectSquare().isPerfectSquare(4));
        System.out.println("true:" + new ValidPerfectSquare().isPerfectSquare(16));
        System.out.println("false:" + new ValidPerfectSquare().isPerfectSquare(2147483647));
        System.out.println("true:" + new ValidPerfectSquare().isPerfectSquare(2147395600));
//        System.out.println(Math.sqrt(2147395600));
    }

    //perfect square is no pow of pows,
    //it's one time pow

    //sqrt
    public boolean isPerfectSquare(int num) {
        if (num < 0) return false;
        for (int i = 0; i <= num; i++){
            int m = i * i;
            if (m == num){
                return true;
            } else if (m > num || m < 0) {
                break;
            }
        }
        return false;
    }

    //log
//    public boolean isPerfectSquare(int num) {
//        if (num < 0) return false;
//        int low = 0;
//        int high = num;
//        while (low <= high){
//            int mid = low + (high - low) / 2;
//            int pow = mid * mid;
//            if (pow == num){
//                return true;
//            } else if (pow > num || (mid != 0 && pow / mid != mid)){//check overflow by deletion
//                high = mid - 1;
//            } else {
//                low = mid + 1;
//            }
//        }
//        return false;
//    }
}
