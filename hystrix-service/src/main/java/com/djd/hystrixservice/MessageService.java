package com.djd.hystrixservice;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author 董金达
 * @version 1.0
 * @name MessageService
 * @date 2020/6/3 22:44
 **/

@Service
public class MessageService {

    private final RestTemplate restTemplate;

    @Value("${eureka.client.service-url.message-service}")
    private String messageServiceUrl;

    public MessageService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @HystrixCommand(fallbackMethod = "getDefaultMessage")
    public String getSuccessMessage() {
        return restTemplate.getForObject(messageServiceUrl + "/getMessage", String.class);
    }

    public String getDefaultMessage() {
        return "Fail to get message!";
    }


}
