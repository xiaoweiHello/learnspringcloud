package com.xiaowei.servicefeign.service.impl;

import com.xiaowei.servicefeign.service.RequestServiceHi;
import org.springframework.stereotype.Service;

/**
 * @ClassName RequestServiceHiImpl
 * @Desciption TODO
 * @Author weizheng
 * @Date 2019/7/23 17:40
 **/
@Service
public class RequestServiceHiImpl implements RequestServiceHi {
    @Override
    public String sayHiService(String name) {
        return "hi, " + name + ", sorry error!";
    }
}
