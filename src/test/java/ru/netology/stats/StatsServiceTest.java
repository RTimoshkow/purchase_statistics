package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    public void shouldCalculateSum() {
        StatsService service = new StatsService();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.calculateSum(purchases);
        assertEquals(expected, actual);
        System.out.println(actual);
    }

    @Test
    public void shouldFindAvgPurchases() {
        StatsService service = new StatsService();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.findAvgPurchases(purchases);
        assertEquals(expected, actual);
        System.out.println(actual);

    }

    @Test
    public void shouldFindMinSales() {
        StatsService service = new StatsService();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.findMinSales(purchases);
        assertEquals(expected, actual);
        System.out.println(actual);
    }

    @Test
    public void shouldFindMaxSales() {
        StatsService service = new StatsService();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.findMaxSales(purchases);
        assertEquals(expected, actual);
        System.out.println(actual);
    }

    @Test
    public void shouldCalculationQuantityMonthsMinSales() {
        StatsService service = new StatsService();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.calculationQuantityMonthsMinSales(purchases);
        assertEquals(expected, actual);
        System.out.println(actual);
    }

    @Test
    public void shouldCalculationQuantityMonthsMaxSales() {
        StatsService service = new StatsService();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.calculationQuantityMonthsMMaxSales(purchases);
        assertEquals(expected, actual);
        System.out.println(actual);
    }
}