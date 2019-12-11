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

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) return 0; // or throw IAE

        int minI = 0;
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < prices[minI]){
                minI = i;
            }
            if (prices[i] - prices[minI] > profit){
                profit = prices[i] - prices[minI];
            }
        }
        return profit;
    }

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
