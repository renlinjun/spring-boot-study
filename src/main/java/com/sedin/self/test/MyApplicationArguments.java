package com.sedin.self.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

/**
 * 作者：REN
 * 创建时间：2017/12/26-19:23
 * 描述：测试获取SpringApplication启动时的参数
 */
@Component
public class MyApplicationArguments {

    /**
     * 获取传入的参数
     * 注：不用管IDE自动注入时的报错
     * 通过构造函数，spring boot会自动将args参数传入ApplicationArguments中
     * spring boot在启动时会将所有构造函数中需要applicationarguments的参数自动注入
     * @return
     */
    @Autowired
    public MyApplicationArguments(ApplicationArguments arguments) {
        System.out.println("========="+arguments);
    }
}
