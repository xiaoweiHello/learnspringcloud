package com.xiaowei.serviceribbon.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName RestTemplateConfig
 * @Desciption TODO
 * @Author weizheng
 * @Date 2019/7/23 16:39
 **/
@Configuration
public class RestTemplateConfig {

    /**
     * 使用 ribbon 进行负载均衡
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
