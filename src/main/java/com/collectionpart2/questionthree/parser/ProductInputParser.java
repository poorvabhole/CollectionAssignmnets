package com.collectionpart2.questionthree.parser;

import com.collectionpart2.questionthree.mapper.ProductInputMapper;
import com.collectionpart2.questionthree.model.Product;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProductInputParser {
    public List<Product> parseArray(String inputFile){
        List<Product> productDetailsList = new ArrayList<>();
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(inputFile));
            String inputline;
            while ((inputline = bufferedReader.readLine()) != null){
                Product product = ProductInputMapper.map(inputline);
                productDetailsList.add(product);
            }
        }catch (FileNotFoundException exception){
            throw new RuntimeException(exception);
        }catch (IOException ex){
            throw new RuntimeException(ex);
        }
        return productDetailsList;
    }
}
