package com.hlkj.springcloud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author Lixiangping
 * @createTime 2022年05月24日 23:14
 * @decription:
 */
@RestController
public class Controller {

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/hello")
    public String sayHi(){
        // 不再需要指定host和port
        return restTemplate.getForObject(
                "http://eureka-client/hello",
                String.class);
    }

}
