package com.hlkj.springcloud;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author Lixiangping
 * @createTime 2022年07月04日 22:26
 * @decription:
 */
@FeignClient("feign-client")
public interface IService {

    @GetMapping("/hello")
    public String helloWorld();

    @PostMapping("/friend")
    public Friend getFriend(@RequestBody Friend friend);

}
