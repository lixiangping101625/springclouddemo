package com.hlkj.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author Lixiangping
 * @createTime 2022年05月14日 21:26
 * @decription:
 */
@RestController
@Slf4j
public class Controller {

    @Resource
    private LoadBalancerClient client;
    @Resource
    private RestTemplate restTemplate;

    /**
     * 调用eureka-client的方法
     * @return
     */
    @GetMapping("/hello")
    public String hello(){
        ServiceInstance instance = client.choose("eureka-client");
        if (instance == null) {
            return "no available instances";
        }
        String target = String.format("http://%s:%s/hello", instance.getHost(), instance.getPort());
        log.info("url is {}", target);
        return restTemplate.getForObject(target, String.class);
    }

    /**
     * 调用eureka-client的方法
     * @return
     */
    @GetMapping("/friend")
    public Friend friend(){
        ServiceInstance instance = client.choose("eureka-client");
        if (instance == null) {
            return null;
        }
        String target = String.format("http://%s:%s/friend", instance.getHost(), instance.getPort());
        log.info("url is {}", target);

        Friend friend = new Friend();
        friend.setName("eureka consumer");

        return restTemplate.postForObject(target, friend, Friend.class);
    }

}
