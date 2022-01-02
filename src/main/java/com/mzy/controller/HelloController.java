package com.mzy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ZhiYuan Ma
 * @create: 2021-12-22 11:06
 * @description:
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String getHello(){
            return "hello world 2021.1.3";
    }
}
