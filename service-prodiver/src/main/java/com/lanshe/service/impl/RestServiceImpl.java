package com.lanshe.service.impl;

import com.lanshe.service.RestService;
import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description
 * @auther 冉长冬
 * @create 2019-05-14 14:52
 *
 *
 * 服务者提供方
 *
 */
@RestSchema(schemaId = "hello")
@RequestMapping("/hello")
public class RestServiceImpl implements RestService {

    @Override
    @GetMapping("/hello")
    public String sayRest(String name) {
        return "Hello Word "+ name;
    }
}
