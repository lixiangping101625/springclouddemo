package com.hlkj.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lixiangping
 * @createTime 2022年05月14日 19:28
 * @decription:
 */
@RestController
@Slf4j
public class Controller {

    @Value("${server.port}")
    private String port;

    @GetMapping("/hello")
    public String helloWorld(){
        return "hello world! this is " + port;
    }

    @PostMapping("/friend")
    public Friend getFriend(@RequestBody Friend friend){
        log.info("you are " + friend.getName());

        friend.setPort(port);
        return friend;
    }

}
