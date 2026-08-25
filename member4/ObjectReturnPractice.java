package InventoryManagementProject.Actual;

public class ObjectReturnPractice {

    public static ReorderSuggestion createSuggestion(){
        ReorderSuggestion suggestion = new ReorderSuggestion("Milk", 7, 23);

        return suggestion;
    }

    public static void main(String[] args) {
        ReorderSuggestion result = createSuggestion();

        System.out.println("Product : " + result.productName);
        System.out.println("Current Stock : " + result.currentStock);
        System.out.println("Recommended Quantity : " + result.recommendedQuantity);
    }
}
