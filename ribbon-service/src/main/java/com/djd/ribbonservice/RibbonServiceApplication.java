package com.djd.ribbonservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

/**
 * 负载均衡
 *
 * @param
 * @author 董金达
 * @date 19:46 2020/6/3
 * @return
 **/

@Controller
@SpringBootApplication
public class RibbonServiceApplication {

    private final RestTemplate restTemplate;

    @Value("${eureka.client.service-url.message-service}")
    private String messageServiceUrl;

    public RibbonServiceApplication(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @ResponseBody
    @GetMapping(value = "/getMessage")
    public String getMessage() {
        return restTemplate.getForObject(messageServiceUrl + "/getMessage", String.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(RibbonServiceApplication.class, args);
    }
}
