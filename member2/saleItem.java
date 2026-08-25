public class saleItem {
    private long productId;
    private float unitPrice;
    private int quantity;
    private float subTotal;

    public saleItem(long productId, float unitPrice, int quantity) {
        this.productId = productId;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.subTotal = quantity * unitPrice;

    }

    public long getProductId() {
        return productId;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;

    }

    public float getSubTotal() {
        return subTotal;
    }

}