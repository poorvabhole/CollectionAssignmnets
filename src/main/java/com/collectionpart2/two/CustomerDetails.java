package com.collectionpart2.two;

public class CustomerDetails {
    private String customerName;
    private String storeLocation;
    private Integer date;
    private String productName;
    private Integer price;
    private String paymentType;



    public CustomerDetails(String customerName, String storeLocation, Integer date, String productName, Integer price,
                           String paymentType) {
        super();
        this.customerName = customerName;
        this.storeLocation = storeLocation;
        this.date = date;
        this.productName = productName;
        this.price = price;
        this.paymentType = paymentType;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getStoreLocation() {
        return storeLocation;
    }
    public void setStoreLocation(String storeLocation) {
        this.storeLocation = storeLocation;
    }
    public Integer getDate() {
        return date;
    }
    public void Integer(Integer date) {
        this.date = date;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }
    public String getPaymentType() {
        return paymentType;
    }
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }
    @Override
    public String toString() {
        return "CustomerDetails [customerName=" + customerName + ", storeLocation=" + storeLocation + ", date=" + date
                + ", productName=" + productName + ", price=" + price + ", paymentType=" + paymentType + "]";
    }

}
