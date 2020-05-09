package edu.problems.leetcode.n1232;

public class CheckIfItIsAStraightLine {

    public static void main(String[] args) {
        int[][] c01 = {{-3,6},{12,-12},{9,2},{4,-12},{-6,3},{-3,10},{11,-4},{4,-7},{4,-8},{-2,4},{6,-6},{12,9}};
        int[][] c02 = {{-3,-2},{12,-2},{9,-2},{4,-2},{-6,-2},{11,-2},{-2,-2},{6,-2}};
        System.out.println(new CheckIfItIsAStraightLine().checkStraightLine2(c02));

//        double x = -3;
//        double y = 15;
//        int x1 = -3;
//        int y1 = 15;
//
//        System.out.println(x / y1);
//        System.out.println(x1 / y);
    }


    public boolean checkStraightLine(int[][] coordinates) {

        int[][] c = coordinates;
        double diffX = c[1][0] - c[0][0];
        double diffY = c[1][1] - c[0][1];
        for (int i = 2; i < c.length; i++){
            if (diffX == 0){
                if (c[i][0] != c[i-1][0]){
                    return false;
                }
            } else if (diffY == 0){
                if (c[i][1] != c[i-1][1]){
                    return false;
                }
            } else if ((c[i][0] - c[i-1][0]) / diffX != (c[i][1] - c[i-1][1]) / diffY){
                return false;
            }
        }
        return true;
    }

    // 1. difference can be either by slope ~angle
    // (y2 - y1) / (x2 - x1) == (y1 - y0) / (x1 - x0)
    //
    // 2. or by "length between dots by each axis"
    // (x2 - x1) / (x1 - x0) == (y2 - y1) / (y1 - y0)
    //
    // because 4:2=6:3 (#1) same as 6:4=3:2 (#2)
    // so
    // save diff for 0st and 1st
    // and all next compare to this diff
    public boolean checkStraightLine2(int[][] coordinates) {
        int[][] c = coordinates;
        int diffX = c[1][0] - c[0][0];
        int diffY = c[1][1] - c[0][1];
        for (int i = 2; i < c.length; i++){
             if ((c[i][0] - c[i-1][0]) * diffY != (c[i][1] - c[i-1][1]) * diffX){
                return false;
            }
        }
        return true;
    }
}
