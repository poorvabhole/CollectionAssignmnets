package com.collectionpart2.questionthree.mapper;

import com.collectionpart2.questionthree.model.Product;

public class ProductInputMapper {
    public static Product map(String data){
        Product product;
        try {
            String[] values = data.split(",");

            String productName = values[0];
            String libraryName = values[1];
            String version = values[2];

            product = new Product(productName, libraryName, version);
        }catch (NumberFormatException exception){
            throw new RuntimeException(exception);
        }
        return product;
    }
}
