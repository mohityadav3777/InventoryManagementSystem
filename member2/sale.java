import java.util.ArrayList;

public class sale {
    private long saleId;
    private String saleDate;
    private float totalAmount;
    private ArrayList<saleItem> items = new ArrayList<>();

    public sale(long saleId, String saleDate) {
        this.saleId = saleId;
        this.saleDate = saleDate;
    }

    public long getSaleId() {
        return saleId;
    }

    public String getSaleDate() {
        return saleDate;
    }

    public float getTotalAmount() {
        return totalAmount;
    }

    public void addItem(saleItem item) {
        items.add(item);
    }

    public void calculateTotal() {
        totalAmount = 0;
        for (int i = 0; i < items.size(); i++) {
            totalAmount += items.get(i).getSubTotal();
        }
    }

}
