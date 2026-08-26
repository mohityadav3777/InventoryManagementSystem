package model;

import java.util.ArrayList;

public class PurchaseOrder {

    private int purchaseOrderId;
    private int supplierId;
    private String status;
    private double totalAmount;

    private ArrayList<PurchaseItem> items;

    public PurchaseOrder() {
        items = new ArrayList<>();
    }

    public PurchaseOrder(int supplierId) {

        this.supplierId = supplierId;
        this.status = "PENDING";
        this.items = new ArrayList<>();
    }

    public PurchaseOrder(int purchaseOrderId,
                         int supplierId,
                         String status,
                         double totalAmount) {

        this.purchaseOrderId = purchaseOrderId;
        this.supplierId = supplierId;
        this.status = status;
        this.totalAmount = totalAmount;
        this.items = new ArrayList<>();
    }

    public int getPurchaseOrderId() {
        return purchaseOrderId;
    }

    public void setPurchaseOrderId(int purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public ArrayList<PurchaseItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<PurchaseItem> items) {
        this.items = items;
    }

    public void addItem(PurchaseItem item) {

        items.add(item);
        calculateTotal();
    }

    public void calculateTotal() {

        totalAmount = 0;

        for (PurchaseItem item : items) {
            totalAmount += item.getTotalPrice();
        }
    }

    public String toString() {

        return "Purchase Order ID: " + purchaseOrderId +
                " | Supplier ID: " + supplierId +
                " | Status: " + status +
                " | Total: ₹" + totalAmount;
    }
}