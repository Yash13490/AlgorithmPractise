package com.algo.array;
/**
 * 
Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Example 1:
Input: [7, 1, 5, 3, 6, 4]
Output: 5

max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger than buying price)
Example 2:
Input: [7, 6, 4, 3, 1]
Output: 0

In this case, no transaction is done, i.e. max profit = 0.
 * @author daveyas1
 *
 */

public class BestTimetoBuyAndSellStock {

	public static void main(String[] args) {
		
		int prices[] = {7, 1, 5, 3, 6, 4};
		
		BestTimetoBuyAndSellStock sol3 = new BestTimetoBuyAndSellStock();
		sol3.maxProfit(prices);
		
	}

	
	
    public int maxProfit(int[] prices) {
    	int min = Integer.MAX_VALUE;
    	int max_diff = 0;
    	
    	for (int i=0; i<prices.length; i++) {
    		if(prices[i]< min) {
    			min = prices[i];
    		}
    		else if(prices[i]-min > max_diff) {
    			max_diff = prices[i]-min;
    		}
    		//System.out.println(min + "    " + max_diff + "    " + prices[i]);
    	}
    	//System.out.println(max_diff);
		return max_diff;
    }
}
