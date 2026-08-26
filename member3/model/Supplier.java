package model;

public class Supplier {

    private int supplierId;
    private String supplierName;
    private String phone;
    private String address;
    private int leadTimeDays;
    private boolean active;

    public Supplier() {
    }

    public Supplier(String supplierName, String phone,
                    String address, int leadTimeDays) {

        this.supplierName = supplierName;
        this.phone = phone;
        this.address = address;
        this.leadTimeDays = leadTimeDays;
        this.active = true;
    }

    public Supplier(int supplierId, String supplierName,
                    String phone, String address,
                    int leadTimeDays, boolean active) {

        this.supplierId = supplierId;
        this.supplierName = supplierName;
        this.phone = phone;
        this.address = address;
        this.leadTimeDays = leadTimeDays;
        this.active = active;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getLeadTimeDays() {
        return leadTimeDays;
    }

    public void setLeadTimeDays(int leadTimeDays) {
        this.leadTimeDays = leadTimeDays;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String toString() {

        return "ID: " + supplierId +
                " | Name: " + supplierName +
                " | Phone: " + phone +
                " | Address: " + address +
                " | Lead Time: " + leadTimeDays + " days" +
                " | Active: " + active;
    }
}