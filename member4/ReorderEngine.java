package InventoryManagementProject.Actual;

public class ReorderEngine {

    public static double calculateRecommendation(int safeStock, int currStock, int dayData, int leadTime, int totalSales){
        double averageSales = (double) totalSales / dayData;
        double expectedSales = averageSales * leadTime;
        double targetStock = expectedSales + safeStock;
        double recommendedItems = targetStock - currStock;

        return recommendedItems;
    }

}
