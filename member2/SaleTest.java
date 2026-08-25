public class SaleTest {

    public static void main(String[] args) {

        sale s = new sale(101, "31-08-2005");

        saleItem milk = new saleItem(102, 55f, 3);
        saleItem bread = new saleItem(103, 20f, 2);

        s.addItem(milk);
        s.addItem(bread);

        s.calculateTotal();

        System.out.println("Sale ID: " + s.getSaleId());
        System.out.println("Sale Date: " + s.getSaleDate());
        System.out.println("Total Amount: ₹" + s.getTotalAmount());
    }
}