package com.atguigu.gulimall.ware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 钊思暮想
 * @date 2023/7/14 15:13
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GulimallWareApplicationTests {
    public static void main(String[] args) {
        SpringApplication.run(GulimallWareApplicationTests.class);
    }
}
