# 注册中心
<!--eureka-server依赖-->
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>
</dependency>

# yml配置

server.port=20000
spring.application.name=eureka-server

# eureka地址
eureka.instance.hostname=localhost
# 是否发起服务注册（注册中心不需要）
eureka.client.register-with-eureka=false
# 是否拉去服务注册表（注册中心保有服务注册表，所以不需要）
eureka.client.fetch-registry=false

# 启动类
@SpringBootApplication
@EnableEurekaServer //启动Eureka服务
public class EurekaServerApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaServerApplication.class)
                .web(WebApplicationType.SERVLET)
                .run(args);
    }
}