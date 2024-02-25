package models;

public class Shoes {

    private String orderId;
    private String customerName;
    private String shippingBillingAddress;
    private String shoeModel;
    private int quantity;
    private double unitPrice;
    private  double subtotal;
    private int taxRate;
    private double taxAmount;
    private double totalAmount;

    public Shoes(String orderId, String customerName, String shippingBillingAddress, String shoeModel, int quantity, double unitPrice, double subtotal, int taxRate, double taxAmount, double totalAmount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.shippingBillingAddress = shippingBillingAddress;
        this.shoeModel = shoeModel;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.subtotal = subtotal;
        this.taxRate = taxRate;
        this.taxAmount = taxAmount;
        this.totalAmount = totalAmount;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getShippingBillingAddress() {
        return shippingBillingAddress;
    }

    public void setShippingBillingAddress(String shippingBillingAddress) {
        this.shippingBillingAddress = shippingBillingAddress;
    }

    public String getShoeModel() {
        return shoeModel;
    }

    public void setShoeModel(String shoeModel) {
        this.shoeModel = shoeModel;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return subtotal/quantity;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public int getTaxRate() {
        return 5;
    }

    public void setTaxRate(int taxRate) {
        this.taxRate = taxRate;
    }

    public double getTaxAmount() {
        return (getSubtotal()*getTaxRate())/100;
    }

    public void setTaxAmount(double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public double getTotalAmount() {
        return getTaxAmount()+getSubtotal();
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
