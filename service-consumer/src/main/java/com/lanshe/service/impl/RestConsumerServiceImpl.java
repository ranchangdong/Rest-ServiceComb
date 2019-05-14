package com.lanshe.service.impl;

import com.lanshe.service.RestService;
import org.apache.servicecomb.provider.springmvc.reference.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Description
 * @auther 冉长冬
 * @create 2019-05-14 15:05
 *
 *
 * 消费者服务接口实现类
 *
 */


@Service
public class RestConsumerServiceImpl implements RestService {

    //RestTemplate 模板
    private final RestTemplate restTemplate = RestTemplateBuilder.create();

    @Override
    public String sayRest(String name) {

        String prodiverName = "prodiver";

        //cse ：服务注册中心 提供的一种协议

        //URL : ces:// 微服务名称 + 具体某个微服务访问路径

        String forObject = restTemplate.getForObject("cse://" + prodiverName + "/hello/hello?name=" + name, String.class);

        return forObject;
    }
}
