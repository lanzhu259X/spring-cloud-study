package com.lanzhu.consumer.feign.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("service-user-a")
public interface ServiceUserAClient {

    @RequestMapping(value = "/servicedemo/a/info", method = RequestMethod.GET)
    String configInfo();

    @RequestMapping(value = "servicedemo/a/title", method = RequestMethod.GET)
    String title();

}
