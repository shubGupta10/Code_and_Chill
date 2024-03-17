public class stockSellandBuy {
    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 4, 3, 6 };

        int result = bestTimeforStocks(prices);
        System.out.println(result);
    }

    static int bestTimeforStocks(int[] prices) {
        int n = prices.length;
        if (n < 2) {
            return 0;
        }

        int maxProfit = 0;
        int minPrice = prices[0];

        for (int i = 1; i < n; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            // minPrice lega and price lega taaki min nikal sake.

            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            // max profit leke , price[i] me dhundega nnd the minprice - price kr dega fir  profit nikal aayega
        }

        return maxProfit;
    }
}
