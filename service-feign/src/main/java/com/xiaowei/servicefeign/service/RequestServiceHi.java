package com.xiaowei.servicefeign.service;

import com.xiaowei.servicefeign.service.impl.RequestServiceHiImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * fallback
 *      设置熔断器产生时的调用类
 */
@FeignClient(value = "service-hi", fallback = RequestServiceHiImpl.class)
public interface RequestServiceHi {

    @GetMapping("/hi")
    String sayHiService(@RequestParam("name") String name);
}
