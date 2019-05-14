package com.lanshe.controller;

import com.lanshe.service.impl.RestConsumerServiceImpl;
import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description
 * @auther 冉长冬
 * @create 2019-05-14 15:16
 */


@RestSchema(schemaId = "test")
@RequestMapping("/test")
public class RestConsumerController {

    @Autowired
    private RestConsumerServiceImpl restConsumerService;

    @GetMapping("/test")
    public String sayRest(String name){

        return restConsumerService.sayRest(name);

    }


}
