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
            String version = values[2];
//            Integer version = Integer.parseInt(values[2].replaceAll("[^0-9]", ""));

            ProductDetails productDetails = new ProductDetails(productName, libraryName, version);
            productDetailsList.add(productDetails);
        }
        return productDetailsList;
    }

    public Map<String, String> getProductWithOutdatedLibrary(List<ProductDetails> productDetailsList, Map<String, String> productMap) {
        Map<String, String> productList = new HashMap<>();
        for (ProductDetails product : productDetailsList) {
            String libraryName = product.getLibraryName();
            String currentVersion = product.getVersion();
            String latestVersion = productMap.get(libraryName);
            if (currentVersion.compareTo(latestVersion) < 0) {
                productList.put(product.getProductName(), product.getLibraryName());
            }
        }
        return productList;
    }
    //        find out latest version of library
    public Map<String, String> getLatestVersion(List<ProductDetails> inputList) {
        Map<String, String> productMap = new HashMap<>();
        for (ProductDetails productDetails : inputList) {
            String currentLibrary = productDetails.getLibraryName();
            String currentVersion = productDetails.getVersion();
//            System.out.println("currentLibrary = "+currentLibrary);
//            System.out.println("currentVersion before if = "+currentVersion);
            if (productMap.containsKey(currentLibrary)) {
                String latestVersion = productMap.get(currentLibrary);
//                System.out.println("currentLibrary = "+currentLibrary);
//                System.out.println("latestVersion = "+latestVersion);
                if (latestVersion.compareTo(currentVersion) > 0) {
                    currentVersion = latestVersion;
                }
//                System.out.println("currentVersion after if = "+currentVersion);
            }
            productMap.put(currentLibrary, currentVersion);
        }
        return productMap;
    }
}
