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

        OutdatedLibrary outdatedLibrary = new OutdatedLibrary();
        List<ProductDetails> productDetailsList = outdatedLibrary.getProductDetails(input);

        Map<String, String> latestVersionMap = outdatedLibrary.getLatestVersion(productDetailsList);
        Map<String,String> productList = outdatedLibrary.getProductWithOutdatedLibrary(productDetailsList,latestVersionMap);

        System.out.println(productList.keySet());

    }
}
