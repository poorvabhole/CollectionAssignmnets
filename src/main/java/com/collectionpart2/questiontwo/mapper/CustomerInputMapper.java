package com.collectionpart2.questiontwo.mapper;

import com.collectionpart2.questiontwo.model.CustomerDetails;

public class CustomerInputMapper {
    public static CustomerDetails map(String data){
        CustomerDetails customerDetails;
        try {
            String[] currentInputArray = data.split(",");

            String customerName = currentInputArray[0];
            String storeLocation = currentInputArray[1];
            Integer date = Integer.parseInt(currentInputArray[2].trim());
            String productName = currentInputArray[3];
            Integer price = Integer.parseInt(currentInputArray[4].replaceAll("[^0-9]","").trim());
            String paymentType = currentInputArray[5];

            customerDetails = new CustomerDetails(customerName, storeLocation, date, productName, price, paymentType);

        }catch (NumberFormatException exception){
            throw new RuntimeException(exception);
        }
        return customerDetails;
    }
}
