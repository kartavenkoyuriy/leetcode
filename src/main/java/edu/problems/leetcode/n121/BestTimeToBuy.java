package edu.problems.leetcode.n121;

public class BestTimeToBuy {
    public static void main(String[] args) {
        BestTimeToBuy b = new BestTimeToBuy();

        int[] p1 = new int[]{3, 2, 1};
        System.out.println(b.maxProfit(p1));

        int[] p2 = new int[]{7, 1, 5, 3, 6, 4};
        System.out.println(b.maxProfit(p2));

        int[] p3 = new int[]{40, 50, 10, 30};
        System.out.println(b.maxProfit(p3));

        int[] p4 = new int[]{25, 40, 50, 10, 30};
        System.out.println(b.maxProfit(p4));

//        int[] p1 = new int[]{3,2,1};
//        System.out.println(b.maxProfit(p1));
//        int[] p1 = new int[]{3,2,1};
//        System.out.println(b.maxProfit(p1));
//        int[] p1 = new int[]{3,2,1};
//        System.out.println(b.maxProfit(p1));
//        int[] p1 = new int[]{3,2,1};
//        System.out.println(b.maxProfit(p1));
//        int[] p1 = new int[]{3,2,1};
//        System.out.println(b.maxProfit(p1));
    }

//    //Kadane's algorithm
//    public int maxProfit(int[] prices) {
//        int maxCur = 0, maxSoFar = 0;
//        for(int i = 1; i < prices.length; i++) {
//            //By reseting maxCur to 0, essentially it means that we have found a point i where the price[i] is lower than the time we bought,
//            //and that we should then try to buy at point i to see if we can achieve a bigger gain.
//            //Because maxCur is recording the difference, the difference between price[i] and itself should be 0.
//            maxCur = Math.max(0, maxCur + prices[i] - prices[i-1]);
//            maxSoFar = Math.max(maxCur, maxSoFar);
//        }
//        return maxSoFar;
//    }

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) return 0; // or throw IAE

        int min = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            profit = Math.max(profit, prices[i] - min);
        }
        return profit;
    }
        //naive bruteforce
//    public int maxProfit(int[] prices) {
//        if (prices == null || prices.length < 2) return 0; //or throw IAE
//
//        int profit = 0;
//        for (int buy = 0; buy < prices.length; buy++) {
//            for (int sell = buy + 1; sell < prices.length; sell++) {
//                if (prices[sell] - prices[buy] > profit) {
//                    profit = prices[sell] - prices[buy];
//                }
//            }
//        }
//        return profit;
//    }
}
