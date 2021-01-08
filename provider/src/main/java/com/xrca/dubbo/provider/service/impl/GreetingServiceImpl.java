package com.xrca.dubbo.provider.service.impl;

import com.xrca.dubbo.service.GreetingService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

/**
 * @author xrca
 * @description 服务实现
 * @date 2020-12-24 11:07
 **/
@DubboService(version = "1.0")
public class GreetingServiceImpl implements GreetingService {
    @Autowired
    private Environment environment;

    @Override
    public String sayHi(String name) {
        return "hi " + name + " ! " + environment.getProperty("server.port");
    }

    @Override
    public String goodbye(String name) {
        return "goodbye " + name + " !";
    }
}
