package model;
public class PurchaseItem {

    private int purchaseItemId;
    private int purchaseOrderId;
    private int productId;
    private int quantity;
    private double unitPrice;

    private String productName;

    public PurchaseItem() {
    }

    public PurchaseItem(int productId, int quantity, double unitPrice) {

        this.productId = productId;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public PurchaseItem(int purchaseItemId,
                        int purchaseOrderId,
                        int productId,
                        int quantity,
                        double unitPrice) {

        this.purchaseItemId = purchaseItemId;
        this.purchaseOrderId = purchaseOrderId;
        this.productId = productId;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public int getPurchaseItemId() {
        return purchaseItemId;
    }

    public void setPurchaseItemId(int purchaseItemId) {
        this.purchaseItemId = purchaseItemId;
    }

    public int getPurchaseOrderId() {
        return purchaseOrderId;
    }

    public void setPurchaseOrderId(int purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getTotalPrice() {
        return quantity * unitPrice;
    }

    public String toString() {

        return "Product ID: " + productId +
                " | Quantity: " + quantity +
                " | Unit Price: ₹" + unitPrice +
                " | Total: ₹" + getTotalPrice();
    }
}