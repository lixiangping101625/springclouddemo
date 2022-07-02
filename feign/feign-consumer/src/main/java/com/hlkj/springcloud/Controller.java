package com.hlkj.springcloud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Lixiangping
 * @createTime 2022年07月02日 15:59
 * @decription:
 */
@RestController
public class Controller {

    //这里其实注入的是FeignClient生成的代理类
    @Resource
    private IService service;

    @GetMapping("/hello")
    public String hello(){
        return service.helloWorld();
    }

}