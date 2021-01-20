package com.leviosa.pumpkin.my_soap_cv.configuration.endpoint;

import com.medium.cv.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class Cv {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @ResponsePayload
    @PayloadRoot(namespace = "http://medium.com/types/cv", localPart = "GeneralInfo")
    public GeneralInfo getGeneralInfo(){
        logger.info("getGeneralInfo");
        ObjectFactory objectFactory = new ObjectFactory();
        GeneralInfo output = objectFactory.createGeneralInfo();
        output.setName("Anastasiia Khramtsova");
        output.setDateOfBirth("20/02/1997");
        output.setEmail("khramtsova.anastasiia.a@gmail.com");
        output.setPhone("+79113182228");
        return output;
    }
}