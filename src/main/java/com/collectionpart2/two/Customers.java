package com.collectionpart2.two;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Customers {
    public static void main(String[] args) {

        String input[] = {
                "Rajan Patil, Aundh,1, Phone Cover,170, Cash",
                "Mohit Gupta, Baner,1, Samsung Battery,900, Credit Card",
                "Rajan Patil, Aundh,3, Samsung Battery,1000, Cash",
                "Nina Kothari, Baner,4, Earphones,500, Credit Card",
                "T Sunitha, Shivajinagar,5, Earphones,550, Credit Card",
                "Rohan Gade, Aundh,10, Motorola Battery,1000, Credit Card",
                "Rajan Patil, Shivajinagar,21, Earphones,550, Credit Card",
                "Rajan Patil, Aundh,22, USB Cable,150, UPI",
                "Meena Kothari, Baner,23, USB Cable,100, Cash",
                "Nina Kothari, Baner,24, USB Cable,200, UP"
        };


        List<CustomerDetails> customerDetailsList = getCustomers(input);



        Map<String, CustomerDetails> result = new HashMap<String, CustomerDetails>();
        for(CustomerDetails customerDetails : customerDetailsList) {
            result.put(customerDetails.getProductName(), customerDetails);
        }
        System.out.println(result);
//		for(CustomerDetails details : customerDetailsList) {
//			System.out.println(details.getCustomerName());
//		}
    }
    private static List<CustomerDetails> getCustomers(String[] input){
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