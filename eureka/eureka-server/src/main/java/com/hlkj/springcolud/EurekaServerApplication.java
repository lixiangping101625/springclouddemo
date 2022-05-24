package com.hlkj.springcolud;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Lixiangping
 * @createTime 2022年05月14日 18:32
 * @decription: Eureka Sever启动类
 */
@SpringBootApplication
@EnableEurekaServer //启动Eureka服务
public class EurekaServerApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaServerApplication.class)
                .web(WebApplicationType.SERVLET)
                .run(args);
    }
}
