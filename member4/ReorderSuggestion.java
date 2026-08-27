package InventoryManagementProject.Actual;

public class ReorderSuggestion {
    private String productName;
    private int currentStock;
    private double recommendedQuantity;
    private double averageSales;
    private double expectedSales;
    private double targetStock;
    private String priority;
    private String reason;

    public ReorderSuggestion(String productName, int currentStock, double recommendedQuantity, double averageSales, double expectedSales, double targetStock, String priority, String reason){
        this.productName = productName;
        this.currentStock = currentStock;
        this.recommendedQuantity = recommendedQuantity;
        this.averageSales = averageSales;
        this.expectedSales = expectedSales;
        this.targetStock = targetStock;
        this.priority = priority;
        this.reason = reason;
    }

    public String getProductName(){
        return productName;
    }

    public int getCurrentStock(){
        return currentStock;
    }

    public double getRecommendedQuantity(){
        return recommendedQuantity;
    }

    public double getAverageSales() {
        return averageSales;
    }

    public double getExpectedSales() {
        return expectedSales;
    }

    public double getTargetStock() {
        return targetStock;
    }

    public String getPriority() {
        return priority;
    }

    public String getReason() {
        return reason;
    }
}