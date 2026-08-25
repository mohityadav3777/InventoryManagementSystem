package InventoryManagementProject.Actual;

public class ReorderSuggestion {
    String productName;
    int currentStock;
    double recommendedQuantity;

    ReorderSuggestion(String productName, int currentStock, double recommendedQuantity){
        this.productName = productName;
        this.currentStock = currentStock;
        this.recommendedQuantity = recommendedQuantity;
    }
}