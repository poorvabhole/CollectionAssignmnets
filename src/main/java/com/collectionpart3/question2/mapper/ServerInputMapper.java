package com.collectionpart3.question2.mapper;


import com.collectionpart3.question2.model.ServerDetails;

public class ServerInputMapper {
    public static ServerDetails map(String data){
        ServerDetails software;
        try {
            String[] values = data.split(",");
            software = new ServerDetails(values[0],values[1],values[2],values[3].trim());
        }catch (NumberFormatException e){
            throw new RuntimeException(e);
        }
        return software;
    }

}
