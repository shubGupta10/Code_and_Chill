public class Best_Time_Buy_Sell_Stocks {
    public static void main(String[] args) {
        int  [] prices = {7,1,5,3,6,4};
        int result = findBestTime(prices);
        System.out.println(result);
    }

    public static int findBestTime(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price: prices ) {
            if (price < minPrice) {
                minPrice = price;
            }
            int profit = price - minPrice;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
        //to find best time
        return maxProfit;
    }
}
