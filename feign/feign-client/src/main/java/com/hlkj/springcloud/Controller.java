package com.hlkj.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lixiangping
 * @createTime 2022年07月04日 22:34
 * @decription:
 */
@RestController
@Slf4j
public class Controller implements IService {

    @Value("${server.port}")
    private String port;

    @Override
    public String helloWorld() {
        return "hello world! this is " + port;
    }

    @Override
    public Friend getFriend(Friend friend) {
        log.info("you are " + friend.getName());

        friend.setPort(port);
        return friend;
    }
}
