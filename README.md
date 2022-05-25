# spring cloud微服务基础demo

注意：spring cloud和springboot版本对应关系：
    https://spring.io/projects/spring-cloud#overview

spring cloud从2020.0开始对netflix oss的支持只保留了eureka

我这里使用的spring cloud版本是Finchley.SR1


项目说明：
    springcloud-demo 顶级项目
    eureka-server 注册中心
    eureka-server-peer1 注册中心1（注册中心HA）
    eureka-server-peer2 注册中心2（注册中心HA）
    eureka-consumer 服务消费者
    ribbon-consumer ribbon客户端负载均衡
