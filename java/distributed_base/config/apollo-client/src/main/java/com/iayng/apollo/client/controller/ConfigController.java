package com.iayng.apollo.client.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ConfigController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConfigController.class);

    @Value("sdad:yang")
    private String yang;

    @GetMapping("/app")
    public Object app(){

        LOGGER.info("the yang value is ---> {} " , yang);

        return yang;

    }


}
