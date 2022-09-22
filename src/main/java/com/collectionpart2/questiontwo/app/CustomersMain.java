package com.collectionpart2.questiontwo.app;

import com.collectionpart2.questiontwo.model.CustomerDetails;
import com.collectionpart2.questiontwo.parser.CustomerInputParser;
import com.collectionpart2.questiontwo.solution.MostDiscountedProduct;

import java.util.List;
import java.util.Map;

public class CustomersMain {
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

        List<CustomerDetails> customerDetailsList = CustomerInputParser.parseArray(input);
        MostDiscountedProduct discountedProduct = new MostDiscountedProduct(customerDetailsList);
//        System.out.println(customerDetailsList);

        Map<String, Integer> priceMap = discountedProduct.getMostDiscountedPrice();
        List<String> customerNameList = discountedProduct.getDiscountProductCustomerName(priceMap);
        System.out.println(priceMap);
        System.out.println(customerNameList);
//        Map<String, CustomerDetails> result = new HashMap<String, CustomerDetails>();
//        for (CustomerDetails customerDetails : customerDetailsList) {
//
//            result.put(customerDetails.getProductName(), customerDetails);
//        }
//        System.out.println(result.values());
//		for(CustomerDetails details : customerDetailsList) {
//			System.out.println(details.getCustomerName());
//		}
    }

}