package com.djd.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 董金达
 */

@RefreshScope
@Controller
@SpringBootApplication
public class ConfigClientApplication {

    @Value("${message:Hello default}")
    private String message;

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
    }

    @ResponseBody
    @RequestMapping(value = "/message")
    public String getMessage() {
        return this.message;
    }


}
