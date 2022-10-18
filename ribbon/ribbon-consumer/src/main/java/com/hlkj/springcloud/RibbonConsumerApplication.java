package com.hlkj.springcloud;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author Lixiangping
 * @createTime 2022年05月14日 21:25
 * @decription:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class RibbonConsumerApplication {

    @Bean
    @LoadBalanced//负载均衡.不用在代码中再传入ip、port具体的服务器地址。由ribbon自己选择具体的服务
    public RestTemplate template(){
        return new RestTemplate();
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder(RibbonConsumerApplication.class)
        .web(WebApplicationType.SERVLET)
        .run(args);
    }

}
