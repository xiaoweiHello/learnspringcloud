package com.xiaowei.serverhi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HiController
 * @Desciption TODO
 * @Author weizheng
 * @Date 2019/7/23 16:23
 **/
@RestController
public class HiController {

    @Value("${server.port}")
    private int port;

    @GetMapping("/hi")
    public String hi(@RequestParam String name) {
        return "hi, " + name + ", i am from port " + port;
    }
}
