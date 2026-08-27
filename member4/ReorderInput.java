package InventoryManagementProject.Actual;

public class ReorderInput {
    private String productName;
    private int safetyStock;
    private int currentStock;
    private int days;
    private int leadTime;
    private int totalSales;

    public ReorderInput(String productName, int safetyStock, int currentStock, int days, int leadTime, int totalSales) {
        this.productName = productName;
        this.safetyStock = safetyStock;
        this.currentStock = currentStock;
        this.days = days;
        this.leadTime = leadTime;
        this.totalSales = totalSales;
    }

    public String getProductName() {
        return productName;
    }

    public int getSafetyStock() {
        return safetyStock;
    }

    public int getCurrentStock() {
        return currentStock;
    }

    public int getDays() {
        return days;
    }

    public int getLeadTime() {
        return leadTime;
    }

    public int getTotalSales() {
        return totalSales;
    }
}
