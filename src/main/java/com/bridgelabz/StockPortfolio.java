package com.bridgelabz;

public class StockPortfolio {
    float totalStockValue = 0;
    public void stockPrinter(String[] nameOfTheStock, int[] noOfShares, float[] shareValue, int noOfStocks){
        System.out.println("Stock Report");
        for (int i = 0; i <= noOfStocks - 1; i++) {
            float stockValue = 0;
            stockValue = noOfShares[i] * shareValue[i];
            System.out.println("Name of the Stock: " + nameOfTheStock[i] + " " + "No of Shares Available: " + noOfShares[i] + " " + "Per Share Value is: "
                    + shareValue[i] +" " + "Value of the Stock: " + stockValue);
            totalStockValue += stockValue;
        }
        System.out.println("Total value of all stocks is: " + totalStockValue);

    }
}
