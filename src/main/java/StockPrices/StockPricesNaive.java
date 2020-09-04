package StockPrices;

import java.util.Arrays;

public class StockPricesNaive {

    public void getMaxProfitNaive(int[] stockPrices) {

        int smallestNumber = stockPrices[0];
        int largestNumber = 0;
        int smallestNumberPosition = 0;
        int largestNumberPosition = 0;
        int maxProfit = 0;


        // obtain smallest value
        for (int i = 0; i < stockPrices.length - 1; i++) {

            if (stockPrices[i + 1] < smallestNumber) {
                smallestNumber = stockPrices[i + 1];
                smallestNumberPosition = i + 1;
            }
        }

        largestNumber = stockPrices[smallestNumberPosition];


        for (int j = stockPrices[smallestNumberPosition]; j < stockPrices.length - 1; j++) {

            if (stockPrices[j + 1] > largestNumber) {
                largestNumber = stockPrices[j + 1];
                largestNumberPosition = j + 1;
            }
        }

        System.out.println(maxProfit = largestNumber - smallestNumber);

    }

}

