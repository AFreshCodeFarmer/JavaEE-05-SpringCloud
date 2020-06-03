package com.djd.feignservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 董金达
 * @version 1.0
 * @name MessageService
 * @date 2020/6/4 0:18
 **/

@FeignClient(value = "message-service", fallback = MessageFallbackService.class)
public interface MessageService {

    /**
     * 调用 message-service 服务的 getMessage() 方法
     *
     * @param
     * @return java.lang.String
     * @author 董金达
     * @date 0:19 2020/6/4
     **/
    @GetMapping(value = "/getMessage")
    public String getMessage();
}
