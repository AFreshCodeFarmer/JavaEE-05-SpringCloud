package com.djd.feignservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Feign
 *
 * @param
 * @author 董金达
 * @date 0:17 2020/6/4
 * @return
 **/

@Controller
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class FeignServiceApplication {

    private final MessageService messageService;

    public FeignServiceApplication(MessageService messageService) {
        this.messageService = messageService;
    }

    @ResponseBody
    @GetMapping(value = "/getMessage")
    public String getMessage() {
        return messageService.getMessage();
    }

    public static void main(String[] args) {
        SpringApplication.run(FeignServiceApplication.class, args);
    }

}
