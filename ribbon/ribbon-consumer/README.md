# 客户端负载均衡组件Ribbon

新增依赖：
<!--ribbon依赖-->
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-netflix-ribbon</artifactId>
</dependency>
启动类中bean注入RestTemplate
@Bean
@LoadBalanced//负载均衡
public RestTemplate template(){
    return new RestTemplate();
}
RestTemplate调用不再需要指定host和port：
@Resource
private RestTemplate restTemplate;

@GetMapping("/hello")
public String sayHi(){
    //不再需要指定host和port
    return restTemplate.getForObject("http://eureka-client/hello", String.class);
}

测试注意事项：启动注册中心》启动两个eureka-client》启动ribbon-consumer

效果：每次访问返回的端口号是eureka-client运行的端口号(默认负载均衡策略)