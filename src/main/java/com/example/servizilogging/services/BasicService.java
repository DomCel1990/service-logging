package com.example.servizilogging.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class BasicService {


    @Value("${firstVariable}")
    int firstValue;
    @Value("${secondVariable}")
    int secondValue;
    Logger logger = LoggerFactory.getLogger(BasicService.class);

    public int getPow() {
        try {
            logger.info("Starting Service "+ "Result: "+(int)Math.pow(firstValue,secondValue));
            return (int)Math.pow(firstValue,secondValue);
        } finally {
            logger.info("Ending service");
        }



    }
}
