package com.collectionpart2.questiontwo.solution;

import com.collectionpart2.questiontwo.model.CustomerDetails;

import java.util.*;

public class MostDiscountedProduct {
    private List<CustomerDetails> customerDetailsList;

    public MostDiscountedProduct(List<CustomerDetails> customerDetailsList) {
        this.customerDetailsList = customerDetailsList;
    }

    public Map<String, Integer> getMostDiscountedPriceMap() {
        Map<String, Integer> discountedPriceMap = new HashMap<>();
        try {
            for (CustomerDetails customerDetails : customerDetailsList) {
                String currentProductName = customerDetails.getProductName();
                Integer currentPrice = customerDetails.getPrice();

                if (discountedPriceMap.containsKey(currentProductName)) {
                    Integer discountedPrice = discountedPriceMap.get(currentProductName);
                    if (discountedPrice > currentPrice) {
                        currentPrice = discountedPrice;
                    }
                }
                discountedPriceMap.put(currentProductName, currentPrice);
            }
        } catch (NullPointerException e) {
            throw new RuntimeException(e);
        }
        return discountedPriceMap;
    }

    public Set<String> getSet() {
        Set<String> productSet = new HashSet<>();
        try {
            for (CustomerDetails details : customerDetailsList) {
                String productName = details.getProductName();
                productSet.add(productName);
            }
        } catch (NullPointerException e) {
            throw new RuntimeException(e);
        }
        return productSet;
    }

    public Map<String, Integer> maximumDiscountMap(Set<String> set, Map<String, Integer> priceMap) {
        Map<String, Integer> maxdiscountMap = new HashMap<>();
        try {
            for (String product : set) {
                Integer maxdiscount = 0;
                for (CustomerDetails details : customerDetailsList) {
                    if (product.equals(details.getProductName()) && maxdiscount < priceMap.get(product) - details.getPrice()) {
                        maxdiscount = priceMap.get(product) - details.getPrice();
                    }
                }
                maxdiscountMap.put(product, maxdiscount);
            }
        } catch (NullPointerException e) {
            throw new RuntimeException(e);
        }
        return maxdiscountMap;
    }

    public List<String> getCustomerName(Map<String, Integer> priceMap, Map<String, Integer> discountedMap) {
        List<String> customerNameList = new ArrayList<>();
        try {
            for (CustomerDetails details : customerDetailsList) {
                if (discountedMap.get(details.getProductName()) == priceMap.get(details.getProductName()) - details.getPrice() && (priceMap.get(details.getProductName()) - details.getPrice() != 0)) {
                    customerNameList.add(details.getCustomerName());
                }
            }
        } catch (NullPointerException e) {
            throw new RuntimeException(e);
        }
        return customerNameList;
    }
//    public List<String> getDiscountProductCustomerName(Map<String, Integer> priceMap){
//        List<String> customerNameList = new ArrayList<>();
//        try {
//            for (CustomerDetails customerDetails : customerDetailsList ) {
//                String productName = customerDetails.getProductName();
//                Integer currentPrice = customerDetails.getPrice();
//                Integer discountedPrice = priceMap.get(productName);
//                if (currentPrice == discountedPrice){
//                    customerNameList.add(customerDetails.getCustomerName());
//                }
//            }
//        }catch (NullPointerException ex){
//            throw new RuntimeException(ex);
//        }
//        return customerNameList;
//    }
}
