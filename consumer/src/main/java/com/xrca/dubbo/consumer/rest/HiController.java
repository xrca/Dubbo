package com.xrca.dubbo.consumer.rest;

import com.xrca.dubbo.service.GreetingService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.Method;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xrca
 * @description TODO
 * @date 2020-12-24 12:12
 **/
@RestController
public class HiController {
    //loadbalance = "roundrobin",
    //, mock = "return '系统繁忙，请稍后再试'"
    @DubboReference(version = "1.1", methods = {@Method(name = "sayHi", retries = 4, timeout = 2000)},
            mock = "force:return '系统繁忙！'")
    private GreetingService greetingService;

    @RequestMapping("hi")
    public String hi(String name) {
        return greetingService.sayHi(name);
    }

    @RequestMapping("bye")
    public String bye(String name) {
        return greetingService.goodbye(name);
    }
}
