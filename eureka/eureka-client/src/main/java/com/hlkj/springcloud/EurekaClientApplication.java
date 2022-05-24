package com.hlkj.springcloud;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Lixiangping
 * @createTime 2022年05月14日 19:25
 * @decription: eureka client
 */
@SpringBootApplication
@EnableDiscoveryClient // 表示到注册中心拉去服务注册列表
public class EurekaClientApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaClientApplication.class)
                .web(WebApplicationType.SERVLET)
                .run(args);
    }
}
