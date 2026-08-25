package InventoryManagementProject.Actual;

public class TestReorder {
    public static void main(String[] args) {
        double result = ReorderEngine.calculateRecommendation(10, 7, 5, 2, 50);
        if(result > 0){
            System.out.println("[Recommendation] The Stock of this Product needed To be Purchased Should be : " + Math.ceil(result) + " Packs");
        }else{
            System.out.println("No Reorder Needed!");
        }
    }
}
