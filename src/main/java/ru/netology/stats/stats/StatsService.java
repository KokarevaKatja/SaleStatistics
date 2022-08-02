package ru.netology.stats.stats;

public class StatsService {

    public int getSaleSum(int[] sales) {
        int saleSum = 0;
        for (int sale : sales) {
            saleSum = saleSum + sale;
        }
        return saleSum;
    }

    public int getAverageMonthSale(int[] sales) {
        int averageMonthSale = 0;
        int sum = getSaleSum(sales);
        for (int sale : sales) {
            averageMonthSale = sum / sales.length;
        }
        return averageMonthSale;
    }

    public int getMaxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int getMinSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int getSalesUnderAverage(int[] sales) {
        int monthAmount = 0;
        int average = getAverageMonthSale(sales);
        for (int sale : sales) {
            if (sale < average) {
                monthAmount = monthAmount + 1;
            }
        }
        return monthAmount;
    }

    public int getSalesOverAverage(int[] sales) {
        int monthAmount = 0;
        int average = getAverageMonthSale(sales);
        for (int sale : sales) {
            if (sale > average) {
                monthAmount = monthAmount + 1;
            }
        }
        return monthAmount;
    }
}

