package com.collectionpart2.questiontwo.parser;

import com.collectionpart2.questiontwo.mapper.CustomerInputMapper;
import com.collectionpart2.questiontwo.model.CustomerDetails;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CustomerInputParser {
    public List<CustomerDetails> parseCSVFile(String inputfile){
        List<CustomerDetails> customerDetailsList = new ArrayList<CustomerDetails>();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(inputfile));
            String inputline;
            while ((inputline = bufferedReader.readLine()) != null){
                CustomerDetails customerDetails = CustomerInputMapper.map(inputline);
                customerDetailsList.add(customerDetails);
            }
        }catch (FileNotFoundException ex){
            throw new RuntimeException(ex);
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        return customerDetailsList;
    }
}
