package com.djd.eurekaconsumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 董金达
 * @version 1.0
 * @name HelloRemote
 * @date 2020/5/28 1:37
 **/

@FeignClient(name = "eureka-producer")
public interface HelloRemote {

    /**
     * 测试服务中心调用相应服务的接口
     * @author 董金达
     * @date 1:39 2020/5/28
     * @param
     * @return java.lang.String
     **/
    @RequestMapping(value = "/api/v1/demo/get")
    public String get();
}
