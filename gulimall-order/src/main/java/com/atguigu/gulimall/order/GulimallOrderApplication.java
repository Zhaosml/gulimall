package com.atguigu.gulimall.order;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 钊思暮想
 * @date 2023/7/14 14:40
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GulimallOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(GulimallOrderApplication.class);
    }
}
