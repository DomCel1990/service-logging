package com.example.servizilogging.controllers;

import com.example.servizilogging.services.BasicService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {
    Logger logger= LoggerFactory.getLogger(BasicController.class);

    @Autowired
    BasicService basicService;

    @GetMapping("/")
    public String getMessage() {
        String message= "Welcome to here";
        logger.info(message);
        return message;
    }

    @GetMapping("/exp")
    public int getPow(){
        return basicService.getPow();
    }

    @GetMapping("/get-errors")
    public void getError(){
        Error error= new Error("ERROR");
        logger.error(("this is a error"), error);
    }
}