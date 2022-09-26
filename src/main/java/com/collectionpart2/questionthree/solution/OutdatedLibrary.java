package com.collectionpart2.questionthree.solution;

import com.collectionpart2.questionthree.model.Product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OutdatedLibrary {
    List<Product> productList;

    public OutdatedLibrary(List<Product> productList) {
        this.productList = productList;
    }

    public Map<String, String> getProductWithOutdatedLibrary(Map<String, String> versionMap) {
        Map<String, String> productMap = new HashMap<>();
        try {
            for (Product product : productList) {
                String libraryName = product.getLibraryName();
                String currentVersion = product.getVersion();
                String latestVersion = versionMap.get(libraryName);
                if (currentVersion.compareTo(latestVersion) < 0) {
                    productMap.put(product.getProductName(), product.getLibraryName());
                }
            }
        }catch (NullPointerException ex){
            throw new RuntimeException(ex);
        }

        return productMap;
    }
    //        find out latest version of library
    public Map<String, String> getLatestVersion() {
        Map<String, String> productMap = new HashMap<>();
        try {
            for (Product productDetails : productList) {
                String currentLibrary = productDetails.getLibraryName();
                String currentVersion = productDetails.getVersion();

                if (productMap.containsKey(currentLibrary)) {
                    String latestVersion = productMap.get(currentLibrary);
                    if (latestVersion.compareTo(currentVersion) > 0) {
                        currentVersion = latestVersion;
                    }
                }
                productMap.put(currentLibrary, currentVersion);
            }
        }catch (NullPointerException ex){
            throw new RuntimeException(ex);
        }

        return productMap;
    }
}
