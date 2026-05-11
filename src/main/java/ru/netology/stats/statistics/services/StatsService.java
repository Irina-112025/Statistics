package ru.netology.stats.statistics.services;

public class StatsService {


    public int total(long[] sales) {
        long total = 0;
        for (int i = 0; i < sales.length; i++) {
            total = total + sales[i]; // сумма продаж за 12 месяцев
        }
        return (int) total;
    }

    public int averageSalesAmount(long[] sales) {
        long averageSalesAmount = total(sales) / 12; // средняя сумма продаж в месяц
        return (int) averageSalesAmount;
    }


    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++)
            if (sales[i] > sales[maxMonth]) { // в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }

        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1;
    }

    public int salesBelowAverage(long[] sales) {
        int salesBelowAverage = 0; // количество месяцев, в которых продажи были ниже среднего

        for (long total : sales) {
            if (total < averageSalesAmount(sales)) {
                salesBelowAverage++;
            }
        }
        return salesBelowAverage;
    }

    public int salesAboveAverage(long[] sales) {
        int salesAboveAverage = 0; // количество месяцев, в которых продажи были выше среднего

        for (long total : sales) {
            if (total > averageSalesAmount(sales)) {
                salesAboveAverage++;
            }
        }
        return salesAboveAverage;
    }

}
