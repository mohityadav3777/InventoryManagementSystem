package InventoryManagementProject.Actual;

import java.util.ArrayList;

public class ReorderService {

    public static ArrayList<ReorderSuggestion> generateRecommendation(ArrayList<ReorderInput> inputs){
        ArrayList<ReorderSuggestion> suggestions = new ArrayList<>();

        for(ReorderInput input : inputs){
            ReorderSuggestion suggestion = ReorderEngine.calculateRecommendation(input.getProductName(),input.getSafetyStock(),input.getCurrentStock(),input.getDays(), input.getLeadTime(), input.getTotalSales());

            if(suggestion != null){
                suggestions.add(suggestion);
            }
        }
        return suggestions;
    }
}
