package com.xiaowei.servicefeign.controller;

import com.xiaowei.servicefeign.service.RequestServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HiController
 * @Desciption TODO
 * @Author weizheng
 * @Date 2019/7/23 17:06
 **/
@RestController
public class HiController {

    @Autowired
    private RequestServiceHi requestServiceHi;

    @GetMapping("/hi")
    public String hi(@RequestParam String name) {
        return requestServiceHi.sayHiService(name);
    }
}
