package com.collectionpart2.questiontwo.model;

public class CustomerDetails {
    private String customerName;
    private String storeLocation;
    private Integer date;
    private String productName;
    private Integer price;
    private String paymentType;



    public CustomerDetails(String customerName, String storeLocation, Integer date, String productName, Integer price,
                           String paymentType) {
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

    public String getStoreLocation() {
        return storeLocation;
    }

    public Integer getDate() {
        return date;
    }

    public String getProductName() {
        return productName;
    }

    public Integer getPrice() {
        return price;
    }

    public String getPaymentType() {
        return paymentType;
    }

    @Override
    public String toString() {
        return java.text.MessageFormat.format("Customer name : {0}, Store Location : {1}, date : {2}," +
                        "Product Name : {3}, price : {4}, Payment Type : {5}"
                ,customerName,storeLocation,date,productName,price,paymentType);
    }
}
