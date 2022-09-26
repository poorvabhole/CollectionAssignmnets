package com.collectionpart2.questiontwo.solution;

import com.collectionpart2.questiontwo.model.CustomerDetails;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostDiscountedProduct {
   private List<CustomerDetails> customerDetailsList;
    public MostDiscountedProduct(List<CustomerDetails> customerDetailsList) {
        this.customerDetailsList = customerDetailsList;
    }
    public Map<String, Integer> getMostDiscountedPrice(){
        Map<String, Integer> discountedPriceMap = new HashMap<>();
        try {
            for (CustomerDetails customerDetails : customerDetailsList){
                String currentProductName = customerDetails.getProductName();
                Integer currentPrice = customerDetails.getPrice();
                Integer count = 0;

                if (discountedPriceMap.containsKey(currentProductName)){
                    Integer discountedPrice = discountedPriceMap.get(currentProductName);
                    if (discountedPrice < currentPrice){
                        currentPrice = discountedPrice;
                        count++;
                    }
                }
                discountedPriceMap.put(currentProductName,currentPrice);
            }
        }catch (NullPointerException e){
            throw new RuntimeException(e);
        }
        return discountedPriceMap;
    }

    public List<String> getDiscountProductCustomerName(Map<String, Integer> priceMap){
        List<String> customerNameList = new ArrayList<>();
        try {
            for (CustomerDetails customerDetails : customerDetailsList ) {
                String productName = customerDetails.getProductName();
                Integer currentPrice = customerDetails.getPrice();
                Integer discountedPrice = priceMap.get(productName);
                if (currentPrice == discountedPrice){
                    customerNameList.add(customerDetails.getCustomerName());
                }
            }
        }catch (NullPointerException ex){
            throw new RuntimeException(ex);
        }
        return customerNameList;
    }
}
