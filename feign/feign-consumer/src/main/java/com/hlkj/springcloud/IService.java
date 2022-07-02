package com.hlkj.springcloud;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Lixiangping
 * @createTime 2022年07月02日 15:57
 * @decription: 远程接口定义
 */
@FeignClient("eureka-client")
public interface IService {


    @GetMapping("/hello")
    String helloWorld();

}
