package com.xrca.dubbo.service;

/**
 * @author xrca
 * @description 服务降级
 * @date 2020-12-24 19:40
 **/
public class GreetingServiceMock implements GreetingService {
    @Override
    public String sayHi(String name) {
        return "当前服务不可用！请稍后再试！";
    }

    @Override
    public String goodbye(String name) {
        return "goodbye " + name + " !";
    }
}
