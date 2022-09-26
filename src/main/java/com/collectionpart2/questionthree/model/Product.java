package com.collectionpart2.questionthree.model;

public class Product {
    private String productName;
    private String libraryName;
    private String version;

    public Product(String productName, String libraryName, String version) {
        this.productName = productName;
        this.libraryName = libraryName;
        this.version = version;
    }

    public String getProductName() {
        return productName;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public String getVersion() {
        return version;
    }

    @Override
    public String toString() {
        return java.text.MessageFormat.format("Product Name : {0}, Library Name : {1}, Version : {2}",
                productName,libraryName,version);
    }
}
