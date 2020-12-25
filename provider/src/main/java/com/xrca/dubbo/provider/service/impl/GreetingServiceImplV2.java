package com.xrca.dubbo.provider.service.impl;

import com.xrca.dubbo.service.GreetingService;
import org.apache.dubbo.config.annotation.DubboService;

import java.util.concurrent.TimeUnit;

/**
 * @author xrca
 * @description 服务实现
 * @date 2020-12-24 11:07
 **/
@DubboService(version = "1.1", owner = "xrca")
public class GreetingServiceImplV2 implements GreetingService {

    @Override
    public String sayHi(String name) {
        System.out.println("================================调用 sayHi ===========================");
        if (1 > 0) {
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (Exception e) {
                e.printStackTrace();
            }
            //System.out.println(1/0);
        }
        return "hello " + name + " !";
    }

    @Override
    public String goodbye(String name) {
        System.out.println("================================调用 goodBye ===========================");
        if (1 > 0) {
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "bye bye " + name + " !";
    }
}
