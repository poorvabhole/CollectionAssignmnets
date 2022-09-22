package com.collectionpart2.questiontwo.parser;

import com.collectionpart2.questiontwo.mapper.CustomerInputMapper;
import com.collectionpart2.questiontwo.model.CustomerDetails;

import java.util.ArrayList;
import java.util.List;

public class CustomerInputParser {
    public static List<CustomerDetails> parseArray(String[] inputData){
        List<CustomerDetails> customerDetailsList = new ArrayList<CustomerDetails>();

        for(String line : inputData) {
            CustomerDetails customerDetails = CustomerInputMapper.map(line);
            customerDetailsList.add(customerDetails);
        }
        return customerDetailsList;
    }
}
