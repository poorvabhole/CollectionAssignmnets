package com.collectionpart2.questiontwo.solution;

import com.collectionpart2.questiontwo.model.CustomerDetails;

import java.util.ArrayList;
import java.util.List;

public class DiscountedProduct {
    public List<CustomerDetails> getCustomers(String[] input){
        List<CustomerDetails> customerDetailsList = new ArrayList<CustomerDetails>();

        for(String line : input) {

            String[] currentInputArray = line.split(",");

            String customerName = currentInputArray[0];
            String storeLocation = currentInputArray[1];
            Integer date = Integer.parseInt(currentInputArray[2]);
            String productName = currentInputArray[3];
            Integer price = Integer.parseInt(currentInputArray[4]);
            String paymentType = currentInputArray[5];

            CustomerDetails customerDetails = new CustomerDetails(customerName, storeLocation, date, productName, price, paymentType);
            customerDetailsList.add(customerDetails);
        }
        return customerDetailsList;

    }
}
