package com.collectionpart2.questionone.mapper;

import com.collectionpart2.questionone.model.Server;

public class SoftwareInputMapper {
    public static Server map(String data){
        Server software;
        try {
            String[] values = data.split(",");
            software = new Server(values[0],values[1],values[2],values[3]);
        }catch (NumberFormatException e){
            throw new RuntimeException(e);
        }
        return software;
    }

}
