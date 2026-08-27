package InventoryManagementProject.Actual;

import java.util.ArrayList;

public class TestReorderService {
    public static void main(String[] args) {
        ArrayList<ReorderInput> inputs = new ArrayList<>();
        ReorderInput p1 = new ReorderInput("Buscuits", 30, 15, 5, 2, 100);
        ReorderInput p2 = new ReorderInput("Milk", 10, 12, 5, 2, 30);
        ReorderInput p3 = new ReorderInput("Paneer", 8, 10, 5, 2, 15);

        inputs.add(p1);
        inputs.add(p2);
        inputs.add(p3);

        ArrayList<ReorderSuggestion> suggestions = ReorderService.generateRecommendation(inputs);

        for(ReorderSuggestion suggestion : suggestions){
            System.out.println("================================");
            System.out.println("Product Name                 : " + suggestion.getProductName());
            System.out.println("Product Current Stock        : " + suggestion.getCurrentStock());
            System.out.println("Product Average Sales        : " + suggestion.getAverageSales());
            System.out.println("Product Expected Sales       : " + suggestion.getExpectedSales());
            System.out.println("Product Target Stock         : " + suggestion.getTargetStock());
            System.out.println("Product Recommended Quantity : " + suggestion.getRecommendedQuantity());
            System.out.println("Priority                     : " + suggestion.getPriority());
            System.out.println("Reason                       : " + suggestion.getReason());
            System.out.println("================================");

        }
    }

}
