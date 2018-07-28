package com.lanzhu.consumer.ribbon.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    private static final Logger log = LoggerFactory.getLogger(ConsumerController.class);

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/config/info", method = RequestMethod.GET)
    public String configInfo() {
        log.info("request config/info.");
        String result = restTemplate.getForEntity("http://SERVICE-USER-A/servicedemo/a/info", String.class).getBody();
        log.info("get service user a info. {}", result);
        return result;
    }

}
