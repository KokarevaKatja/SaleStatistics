package ru.netology.stats.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldCalcSaleSum() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSaleSum = 180;
        int actualSaleSum = service.getSaleSum(sales);

        Assertions.assertEquals(expectedSaleSum, actualSaleSum);
    }

    @Test
    public void shouldCalcAverageMonthSale() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverageSale = 15;
        int actualAverageSale = service.getAverageMonthSale(sales);

        Assertions.assertEquals(expectedAverageSale, actualAverageSale);
    }

    @Test
    public void shouldCalcMonthWithMaxSale() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonthWithMaxSale = 8;
        int actualMonthWithMaxSale = service.getMaxSales(sales);

        Assertions.assertEquals(expectedMonthWithMaxSale, actualMonthWithMaxSale);
    }

    @Test
    public void shouldCalcMonthWithMinSale() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonthWithMinSale = 9;
        int actualMonthWithMinSale = service.getMinSales(sales);

        Assertions.assertEquals(expectedMonthWithMinSale, actualMonthWithMinSale);
    }

    @Test
    public void shouldCalcMonthAmountUnderAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonthAmountUnderAverage = 5;
        int actualMonthAmountUnderAverage = service.getSalesUnderAverage(sales);

        Assertions.assertEquals(expectedMonthAmountUnderAverage, actualMonthAmountUnderAverage);
    }

    @Test
    public void shouldCalcMonthAmountOverAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonthAmountOverAverage = 5;
        int actualMonthAmountOverAverage = service.getSalesOverAverage(sales);

        Assertions.assertEquals(expectedMonthAmountOverAverage, actualMonthAmountOverAverage);
    }
}
