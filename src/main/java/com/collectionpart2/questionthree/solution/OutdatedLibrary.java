package com.collectionpart2.questionthree.solution;

import com.collectionpart2.questionthree.model.ProductDetails;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OutdatedLibrary {
    //        convert input string to ProductDetails object
    public List<ProductDetails> getProductDetails(String[] input) {
        List<ProductDetails> productDetailsList = new ArrayList<>();

        for (String line : input) {
            String[] values = line.split(",");

            String productName = values[0];
            String libraryName = values[1];
            Integer version = Integer.parseInt(values[2].replaceAll("[^0-9]", ""));

            ProductDetails productDetails = new ProductDetails(productName, libraryName, version);
            productDetailsList.add(productDetails);
        }
        return productDetailsList;
    }

    public Map<String, ProductDetails> processData(List<ProductDetails> inputList) {
        Map<String, ProductDetails> productDetailsMap = new HashMap<>();

        for (ProductDetails productDetail : inputList) {
            ProductDetails currentProduct = productDetailsMap.get(productDetail.getLibraryName());

            if (currentProduct == null || currentProduct.getVersion() > productDetail.getVersion()) {
                productDetailsMap.put(productDetail.getLibraryName(), productDetail);
            }
        }
        return productDetailsMap;
    }

    public Map<String, String> getProductWithOutdatedLibrary(Map<String, ProductDetails> productDetailsMap) {
//        List<String> productList = new ArrayList<>();
        Map<String, String> productMap = new HashMap<>();
        for (String library : productDetailsMap.keySet()) {
            ProductDetails productDetails = productDetailsMap.get(library);
            String productName = productDetails.getProductName();
//            productList.add(productName);
            productMap.put(library, productName);
        }
//        return productList;
        return productMap;
    }
}
