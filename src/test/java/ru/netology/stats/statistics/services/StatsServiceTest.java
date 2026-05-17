package ru.netology.stats.statistics.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import ru.netology.stats.statistics.services.StatsService;

public class StatsServiceTest {

    @Test
    public void Total() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedTotal = 180;
        long actualTotal = service.total(sales);

        Assertions.assertEquals(expectedTotal, actualTotal);
    }

    @Test
    public void AverageSalesAmount() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAverageSalesAmount = 15;
        long actualAverageSalesAmount = service.averageSalesAmount(sales);

        Assertions.assertEquals(expectedAverageSalesAmount, actualAverageSalesAmount);

    }

    @Test
    public void maxSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxSales = 6;
        int actualMaxSales = service.maxSales(sales);

        Assertions.assertEquals(expectedMaxSales, actualMaxSales);

    }

    @Test
    public void minSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinSales = 9;
        int actualMinSales = service.minSales(sales);

        Assertions.assertEquals(expectedMinSales, actualMinSales);

    }

    @Test
    public void salesBelowAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSalesBelowAverage = 5;
        int actualSalesBelowAverage = service.salesBelowAverage(sales);

        Assertions.assertEquals(expectedSalesBelowAverage, actualSalesBelowAverage);

    }

    @Test
    public void salesAboveAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSalesAboveAverage = 5;
        int actualSalesAboveAverage = service.salesAboveAverage(sales);

        Assertions.assertEquals(expectedSalesAboveAverage, actualSalesAboveAverage);

    }

}
