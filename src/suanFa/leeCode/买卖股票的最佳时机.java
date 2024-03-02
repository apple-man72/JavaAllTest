package suanFa.leeCode;


public class 买卖股票的最佳时机 {

    public static void main(String[] args) {
        int[] a = new int[]{7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit2(a));
    }

    /**
     * 给定一个数组 prices ，它的第 i 个元素 prices[i] 表示一支给定股票第 i 天的价格。
     * 你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。
     * 返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0
     * @param prices
     * @return
     */
    public static int maxProfit1(int[] prices) {
        if (prices.length <= 1) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            if (prices[i] - min > max) {
                max = prices[i] - min;
            }
        }
        return max;

    }

    /**
     * 买卖股票的最佳时机 II
     * 给定一个数组 prices ，其中 prices[i] 是一支给定股票第 i 天的价格。
     * <p>
     * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
     * <p>
     * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
     * <p>
     */
    public static int maxProfit2(int[] prices) {
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {  //遍历数组
            maxProfit += Math.max(0, prices[i] - prices[i - 1]);//如果当前值大于前一天值，那么就卖出获得利润
        }
        return maxProfit;
    }
}



