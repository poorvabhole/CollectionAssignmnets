package com.collectionpart2.questionthree.app;

import com.collectionpart2.questionthree.model.Product;
import com.collectionpart2.questionthree.parser.ProductInputParser;
import com.collectionpart2.questionthree.solution.OutdatedLibrary;

import java.util.List;
import java.util.Map;

public class ProductWithOutdatedVersion {
    public static void main(String[] args) {
        try {
            ProductInputParser inputParser = new ProductInputParser();
            String filepath = "/home/priyab/CollectionAssignmnets/src/main/java/com/collectionpart2/questionthree/ProductInputFile.csv";
            List<Product> productList = inputParser.parseArray(filepath);
            OutdatedLibrary outdatedLibrary = new OutdatedLibrary(productList);

            final Map<String, String> latestVersionMap = outdatedLibrary.getLatestVersion();
            final Map<String,String> productMap = outdatedLibrary.getProductWithOutdatedLibrary(latestVersionMap);

            System.out.println(productMap.keySet());
        }catch (Exception exception){
            System.out.println(exception.getMessage());
            exception.printStackTrace();
        }
    }
}
