package com.lanzhu.service.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/servicedemo/b")
@RefreshScope
public class DemoController {

    private static final Logger log = LoggerFactory.getLogger(DemoController.class);

    @Value("${info.title}")
    private String title;

    @GetMapping(value = "/title", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getTitle() {
        log.info("title:{}", title);
        return this.title;
    }

}
