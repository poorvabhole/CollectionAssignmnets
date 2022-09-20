package com.collectionpart2.questionthree.app;

import com.collectionpart2.questionthree.model.ProductDetails;
import com.collectionpart2.questionthree.solution.OutdatedLibrary;

import java.util.List;
import java.util.Map;

public class ProductWithOutdatedVersion {
    public static void main(String[] args) {
        String[] input = {
                "Mail Server, Authentication Library, v6",
                "Video Call Server, Authentication Library, v7",
                "Mail Server, Data Storage Library, v10",
                "Chat Server, Data Storage Library, v11",
                "Mail Server, Search Library, v6",
                "Chat Server, Authentication Library, v8",
                "Chat Server, Presence Library, v2",
                "Video Call Server, Data Storage Library, v10",
                "Video Call Server, Video Compression Library, v3"
        };
//        input list of product name, library name, version name
//        then, find product name which is using lowest (out-dated) version

        OutdatedLibrary outdatedLibrary = new OutdatedLibrary();
        List<ProductDetails> productDetailsList = outdatedLibrary.getProductDetails(input);
//        System.out.println(productDetailsList);

        Map<String, ProductDetails> productDetailsMap = outdatedLibrary.processData(productDetailsList);
//        System.out.println(productDetailsMap);
//        List<String> productList = outdatedLibrary.getProductWithOutdatedLibrary(productDetailsMap);
//        System.out.println(productList);
        Map<String,String> productMap = outdatedLibrary.getProductWithOutdatedLibrary(productDetailsMap);
        System.out.println(productMap);
    }
}
