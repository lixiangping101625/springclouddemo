package com.hlkj.springcloud;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Lixiangping
 * @createTime 2022年07月02日 15:54
 * @decription:
 */

@SpringBootApplication
@EnableDiscoveryClient // 表示到注册中心拉去服务注册列表
@EnableFeignClients // Feign关键注解
public class FeignConsumerApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(FeignConsumerApplication.class)
                .web(WebApplicationType.SERVLET)
                .run(args);
    }

}

