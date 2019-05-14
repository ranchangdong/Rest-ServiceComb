package com.lanshe.service.impl;

import org.apache.servicecomb.springboot.starter.provider.EnableServiceComb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description
 * @auther 冉长冬
 * @create 2019-05-14 14:56
 */
@SpringBootApplication
@EnableServiceComb   //向注册中心注册
public class RestSpringBootApplication {

    public static void main(String args[]) {
        SpringApplication.run(RestSpringBootApplication.class,args);
    }

}
