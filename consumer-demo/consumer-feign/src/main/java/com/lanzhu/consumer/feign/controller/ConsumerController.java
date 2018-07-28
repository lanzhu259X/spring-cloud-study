package com.lanzhu.consumer.feign.controller;

import com.lanzhu.consumer.feign.remote.ServiceUserAClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    private static final Logger log = LoggerFactory.getLogger(ConsumerController.class);

    @Autowired
    private ServiceUserAClient serviceUserAClient;

    @RequestMapping(value = "/config/info", method = RequestMethod.GET)
    public String configInfo() {
        String result = serviceUserAClient.configInfo();
        log.info("get service user a config info result: {}", result);
        return result;
    }

    @RequestMapping(value = "/config/title", method = RequestMethod.GET)
    public String configTitle() {
        String result = serviceUserAClient.title();
        log.info("get service use a config title:{}", result);
        return result;
    }
}
