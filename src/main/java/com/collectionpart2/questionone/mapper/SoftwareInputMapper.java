package com.collectionpart2.questionone.mapper;

import com.collectionpart2.questionone.model.Software;

public class SoftwareInputMapper {
    public static Software map(String data){
        Software software;
        try {
            String[] values = data.split(",");
            software = new Software(values[0],values[1],values[2],values[3]);
        }catch (NumberFormatException e){
            throw new RuntimeException(e);
        }
        return software;
    }

}
