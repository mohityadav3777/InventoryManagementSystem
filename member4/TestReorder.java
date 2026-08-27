package InventoryManagementProject.Actual;

public class TestReorder {
    public static void main(String[] args) {
        ReorderSuggestion result = ReorderEngine.calculateRecommendation("Buscuits", 30, 15, 5, 2, 100);
        if(result != null){
            System.out.println("[Recommendation] The Stock of "+ result.getProductName() +" needed To be Purchased Should be : " + result.getRecommendedQuantity() + " Packs");
            System.out.println("While the current Stock of " + result.getProductName() + " is : " + result.getCurrentStock());
        }else{
            System.out.println("No Reorder Needed!");
        }
    }
}
