package com.collectionpart2.questiontwo.app;

import com.collectionpart2.questiontwo.model.CustomerDetails;
import com.collectionpart2.questiontwo.parser.CustomerInputParser;
import com.collectionpart2.questiontwo.solution.MostDiscountedProduct;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CustomersMain {
    public static void main(String[] args) {
        try {
            CustomerInputParser inputParser = new CustomerInputParser();
            String filepath = "/home/priyab/CollectionAssignmnets/src/main/java/com/collectionpart2/questiontwo/CustomerInputFile.csv";
            List<CustomerDetails> customerDetailsList = inputParser.parseCSVFile(filepath);
            MostDiscountedProduct discountedProduct = new MostDiscountedProduct(customerDetailsList);

            final Map<String, Integer> priceMap = discountedProduct.getMostDiscountedPriceMap();
            final Set<String> productSet = discountedProduct.getSet();

            final Map<String, Integer> discountedMap = discountedProduct.maximumDiscountMap(productSet,priceMap);
//            final List<String> customerNameSet = discountedProduct.getDiscountProductCustomerName(discountedMap);

            final List<String> customerNameList = discountedProduct.getCustomerName(priceMap,discountedMap);
            System.out.println(customerNameList);

        }catch (Exception exception){
            System.out.println(exception.getMessage());
            exception.printStackTrace();
        }
    }
}