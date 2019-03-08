package com.example.demo.controller;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2019/3/7.
 */
public class HelloController {
    private final Logger logger = Logger.getLogger(getClass());
    @Autowired
    private DiscoveryClient client;
    @RequestMapping(value= "/hello", method= RequestMethod.GET)
    public String index() {
        ServiceInstance instance = client.getLocalServiceinstance();
        logger.info("/hello, host:" + instance.getHost()+",service id:" +
                instance.getServiceid());

        return "Hello Wor1ld";
    }
}
