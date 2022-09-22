package com.collectionpart2.questiontwo.mapper;

import com.collectionpart2.questiontwo.model.CustomerDetails;

public class CustomerInputMapper {
    public static CustomerDetails map(String data){
        String[] currentInputArray = data.split(",");

        String customerName = currentInputArray[0];
        String storeLocation = currentInputArray[1];
        Integer date = Integer.parseInt(currentInputArray[2]);
        String productName = currentInputArray[3];
        Integer price = Integer.parseInt(currentInputArray[4]);
        String paymentType = currentInputArray[5];

        CustomerDetails customerDetails = new CustomerDetails(customerName, storeLocation, date, productName, price, paymentType);

        return customerDetails;
    }
}
