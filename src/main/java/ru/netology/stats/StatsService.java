package ru.netology.stats;

public class StatsService {

    public int calculateSum(int[] purchases) {
        int sum = 0;
        for (int purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    public int findAvgPurchases(int[] purchases) {
        return calculateSum(purchases) / purchases.length;
    }

    public int findMinSales(int[] purchases) {
        int minMonth = 0;
        int month = 0;
        for (int purchase : purchases) {
            if (purchase <= purchases[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int findMaxSales(int[] purchases) {
        int minMonth = 0;
        int month = 0;
        for (int purchase : purchases) {
            if (purchase >= purchases[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int calculationQuantityMonthsMinSales(int[] purchases) {
        int avg = calculateSum(purchases) / purchases.length;
        int quantityMonths = 0;
        for (int purchase : purchases) {
            if (purchase < avg) {
                quantityMonths ++;
            }
        }
        return quantityMonths;
    }

    public int calculationQuantityMonthsMMaxSales(int[] purchases) {
        int avg = calculateSum(purchases) / purchases.length;
        int quantityMonths = 0;
        for (int purchase : purchases) {
            if (purchase > avg) {
                quantityMonths ++;
            }
        }
        return quantityMonths;
    }
}
