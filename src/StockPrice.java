/*
 * Suppose we could access yesterday's stock prices as a list, where:
 * The indices are the time in minutes past trade opening time, which was 9:30am local time.
 * The values are the price in dollars of Apple stock at that time.
 * So if the stock cost $500 at 10:30am, stock_prices_yesterday[60] = 500.
 * Write an efficient function that takes stock_prices_yesterday and returns the 
 * best profit I could have made from 1 purchase and 1 sale of 1 Apple stock yesterday.
 */

public class StockPrice {

	public int getMaxProfit(int[] stockPricesYesterday) {
		int maxProfit = stockPricesYesterday[1] - stockPricesYesterday[0];
		int minSoFar = Math.min(stockPricesYesterday[1], stockPricesYesterday[0]);
		for (int i = 2; i < stockPricesYesterday.length; i++) {
			int currentProfit = stockPricesYesterday[i] - minSoFar;
			maxProfit = Math.max(maxProfit, currentProfit);
			minSoFar = Math.min(minSoFar, stockPricesYesterday[i]);
		}
		return maxProfit;
	}
}
