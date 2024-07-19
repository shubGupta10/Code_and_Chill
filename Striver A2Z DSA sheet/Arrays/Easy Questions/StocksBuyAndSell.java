public class StocksBuyAndSell {
    public static void main(String[] args){
        int [] prices = {7,6,4,3,1};
        System.out.println(StocksBuyAndSell(prices));
    }

    //prices= [7,1,5,3,6,4]
    public static int StocksBuyAndSell(int[] prices){
        //find the day, where price is less
       if(prices == null || prices.length == 0) return 0;


       int minPrice = Integer.MAX_VALUE;
       int maxProfit = 0;

       for(int price: prices){
           if(price < minPrice){
               minPrice = price;
           }

           int profit = price - minPrice;


           if(profit > maxProfit){
               maxProfit = profit;
           }
       }
       return maxProfit;
    }
}
