package com.hlkj.springcloud;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Lixiangping
 * @createTime 2022年05月25日 11:30
 * @decription: Ribbon负载均衡策略配置
 */
@Configuration
//服务级别负载均衡（优先级高于配置文件）
//@RibbonClient(name = "eureka-client", configuration = com.netflix.loadbalancer.RandomRule.class)
public class RibbonConfiguration {

    /**
     * 全局负载均衡
     * @return
     */
    @Bean
    public IRule ribbonRule(){
        return new RandomRule();
    }

}
