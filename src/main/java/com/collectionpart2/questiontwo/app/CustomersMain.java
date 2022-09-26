package com.collectionpart2.questiontwo.app;

import com.collectionpart2.questiontwo.model.CustomerDetails;
import com.collectionpart2.questiontwo.parser.CustomerInputParser;
import com.collectionpart2.questiontwo.solution.MostDiscountedProduct;

import java.util.List;
import java.util.Map;

public class CustomersMain {
    public static void main(String[] args) {
        try {
            CustomerInputParser inputParser = new CustomerInputParser();
            String filepath = "/home/priyab/CollectionAssignmnets/src/main/java/com/collectionpart2/questiontwo/CustomerInputFile.csv";
            List<CustomerDetails> customerDetailsList = inputParser.parseCSVFile(filepath);
            MostDiscountedProduct discountedProduct = new MostDiscountedProduct(customerDetailsList);
//        System.out.println(customerDetailsList);

            final Map<String, Integer> priceMap = discountedProduct.getMostDiscountedPrice();
            final List<String> customerNameList = discountedProduct.getDiscountProductCustomerName(priceMap);
            System.out.println(priceMap);
            System.out.println(customerNameList);
        }catch (Exception exception){
            System.out.println(exception.getMessage());
            exception.printStackTrace();
        }
    }
}