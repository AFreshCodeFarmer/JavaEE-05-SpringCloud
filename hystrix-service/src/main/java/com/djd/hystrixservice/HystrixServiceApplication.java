package com.djd.hystrixservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * TODO
 *
 * @param
 * @author 董金达
 * @date 18:37 2020/6/3
 * @return
 **/

@Controller
@EnableCircuitBreaker
@EnableDiscoveryClient
@SpringBootApplication
public class HystrixServiceApplication {

    private final MessageService messageService;

    public HystrixServiceApplication(MessageService messageService) {
        this.messageService = messageService;
    }

    @ResponseBody
    @GetMapping(value = "/getMessage")
    public String getMessage() {
        return messageService.getSuccessMessage();
    }

    public static void main(String[] args) {
        SpringApplication.run(HystrixServiceApplication.class, args);
    }
}
