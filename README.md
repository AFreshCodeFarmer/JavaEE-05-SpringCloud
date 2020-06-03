# 目录结构说明
* eureka-server 服务注册中心

  http://localhost:8080/eureka/

* eureka-client  eureka 客户端

  http://localhost:8088/demo/get

* eureka-producer 另一个服务注册中心，只为演示 eureka-consumer

* eureka-consumer 客户端调用服务

  http://localhost:8082/api/v1/demo/get

  网关转发功能完整路径：调用者 -> zuul -> consumer -> producer -> consumer -> zuul -> 调用者

  http://localhost:8083/eureka-consumer/api/v1/demo/get

* eureka-zuul API网关服务

    http://localhost:8082/eureka-client/demo/get

* spring-config-server 配置中心，配置 RabbitMQ 实现手动刷新

    refresh: http://localhost:8081/actuator/bus-refresh

    remote config git: https://github.com/AFreshCodeFarmer/spring-config.git

* spring-config-client 配置中心客户端，从配置中心获取配置

    http://localhost:8082/message

* message-service 提供响应简单 GET 请求的服务

* hystrix-service 断路保护，提供服务降级方法

    http://localhost:8086/getMessage

* ribbon-service 负载均衡

    http://localhost:8084/getMessage

* feign-service 基于Ribbon和Hystrix的声明式服务调用

    当使用Feign时，Spring Cloud集成了Ribbon和Eureka以提供负载均衡的服务调用及基于Hystrix的服务容错保护功能

    http://localhost:8087/getMessage

    

    