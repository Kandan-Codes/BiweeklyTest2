package biweekly;

public class BestTimeStock {
    public static void main(String[] args) {
        int[] prices = {7, 6, 5, 4, 3, 2, 1};
        System.out.println(bestTimeToSellStock(prices));
    }

    private static int bestTimeToSellStock(int[] prices) {
        int maximumProfit = 0;
        int minimumPriceStock = prices[0];

        for(int index = 1; index < prices.length; index++) {
            maximumProfit = Math.max(maximumProfit, prices[index] - minimumPriceStock);
            if(minimumPriceStock > prices[index]) {
                minimumPriceStock = prices[index];
            }
        }
        return maximumProfit;
    }
}
