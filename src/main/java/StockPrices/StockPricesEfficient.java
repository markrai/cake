package StockPrices;

public class StockPricesEfficient {

    /**
     * This method receives an array of integers.
     * example: [3,2,1,6,7,3,2,9,2]
     * It returns the maximum profit that could be earned by buying
     * at the cheapest rate, and selling at the highest possible rate.
     * In this case, buying at 1, and selling at 9, to get 8 as the profit.
     */


    public void getMaxProfitEfficently(int[] input) {

        //handle case if there are less than 2 trades only
        if (input.length < 2) {
            throw new IllegalArgumentException("Getting a profit requires at least 2 prices");
        }

        // we'll greedily update minPrice and maxProfit, so we initialize
        // them to the first price and the first possible profit

        int minPrice = input[0];
        int maxProfit = input[1] - input[0];

        // start at the second index, i.e. [1]
        for (int i = 1; i < input.length; i++) {
            int currentPrice = input[i];


            // check potential profit
            int potentialProfit = currentPrice - minPrice;

            // update maxProfit if we can do better
            maxProfit = Math.max(maxProfit, potentialProfit);


            //update minPrice so it's always the lowest we've seen so far
            minPrice = Math.min(minPrice, currentPrice);

        }
        System.out.println(maxProfit);

    }

}


