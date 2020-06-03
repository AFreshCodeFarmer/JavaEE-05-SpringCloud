package com.djd.feignservice;

import org.springframework.stereotype.Component;

/**
 * 服务降级实现类
 *
 * @author 董金达
 * @version 1.0
 * @name MessageFallbackService
 * @date 2020/6/4 0:22
 **/

@Component
public class MessageFallbackService implements MessageService {

    @Override
    public String getMessage() {
        return "Hello world!";
    }
}
