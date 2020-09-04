import StockPrices.StockPricesEfficient;
import StockPrices.StockPricesNaive;
import org.junit.Test;

public class TestStockPrices {

    @Test
    public void testGetMaxProfitNaive() {
        System.out.println("Max Profit Naive w/ fluctuating profits:");
        long startTime = System.nanoTime();

        StockPricesNaive sp = new StockPricesNaive();
        int[] data = {11, 3, 5, 4, 1, 2, 7, 9, 6, 11, 8, 10};
        sp.getMaxProfitNaive(data);

        long stopTime = System.nanoTime();
        System.out.println(stopTime - startTime);
    }

    @Test
    public void testGetMaxProfitEfficient() {
        System.out.println("Max Profit Efficient w/ fluctuating profits:");
        long startTime = System.nanoTime();

        StockPricesEfficient sp = new StockPricesEfficient();
        int[] data = {11, 3, 5, 4, 1, 2, 7, 9, 6, 11, 8, 10};
        sp.getMaxProfitEfficently(data);

        long stopTime = System.nanoTime();
        System.out.println(stopTime - startTime);
    }


    @Test
    public void testGetMaxProfitEfficientDecreasingProfits() {
        System.out.println("Max Profit Efficient w/ Decreasing Profits:");
        long startTime = System.nanoTime();

        StockPricesEfficient sp = new StockPricesEfficient();
        int[] data = {4, 3, 2, 1};
        sp.getMaxProfitEfficently(data);

        long stopTime = System.nanoTime();
        System.out.println(stopTime - startTime);
    }
}
