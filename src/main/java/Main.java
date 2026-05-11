import ru.netology.stats.statistics.services.StatsService;

public class Main {

    public static void main(String[] args) {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int total = service.total(sales);
        System.out.println("сумма продаж за 12 месяцев: " + total);

        long averageSalesAmount = service.averageSalesAmount(sales);
        System.out.println("средняя сумма продаж в месяц: " + averageSalesAmount);

        int maxSales = service.maxSales(sales);
        System.out.println("номер месяца, в котором был пик продаж: " + maxSales);

        int minSales = service.minSales(sales);
        System.out.println("номер месяца, в котором был минимум продаж: " + minSales);

        int salesBelowAverage = service.salesBelowAverage(sales);
        System.out.println("количество месяцев, в которых продажи были ниже среднего: " + salesBelowAverage);

        int salesAboveAverage = service.salesAboveAverage(sales);
        System.out.println("количество месяцев, в которых продажи были выше среднего: " + salesAboveAverage);

    }
}
