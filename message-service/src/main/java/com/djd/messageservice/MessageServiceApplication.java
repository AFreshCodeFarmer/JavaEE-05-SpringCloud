package com.djd.messageservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @param
 * @author 董金达
 * @date 19:39 2020/6/3
 * @return
 **/

@Controller
@SpringBootApplication
public class MessageServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MessageServiceApplication.class, args);
    }

    @ResponseBody
    @GetMapping(value = "/getMessage")
    public String getMessage() {
        System.out.println("====================Response from this service====================");
        return "succeed to call message-service!";
    }

}
