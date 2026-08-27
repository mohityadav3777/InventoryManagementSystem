package InventoryManagementProject.Actual;

public class ReorderEngine {

//    public static ReorderSuggestion createSuggestion(){
//        ReorderSuggestion suggestion = new ReorderSuggestion("Milk", 7, 23);
//
//        return suggestion;
//    }

    public static ReorderSuggestion calculateRecommendation(String productName,int safeStock, int currStock, int dayData, int leadTime, int totalSales){
        double averageSales = (double) totalSales / dayData;
        double expectedSales = averageSales * leadTime;
        double targetStock = expectedSales + safeStock;
        double recommendedItems = targetStock - currStock;


        if(recommendedItems > 0){
            String productPriority;
            String reorderReason;
            double priorityResult = currStock / targetStock;
            if(priorityResult >= 0.75){
                productPriority = "Low";
                reorderReason = "Current stock is below target but still relatively close to the required level.";
            }else if(priorityResult >= 0.45){
                productPriority =  "Medium";
                reorderReason = "Current stock is below the target stock and may require replenishment soon.";

            }else{
                productPriority =  "High";
                reorderReason = "Current stock is critically below the target stock.";

            }
            ReorderSuggestion suggestion = new ReorderSuggestion(productName, currStock, recommendedItems, averageSales, expectedSales, targetStock, productPriority, reorderReason);
            return suggestion;
        }else{
            return null;
        }
    }



}
