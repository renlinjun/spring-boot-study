package com.sedin.self.test;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

/**
 * 作者：REN
 * 创建时间：2017/12/26-21:58
 * 描述：测试ApplicationRunner在什么时候运行，ApplicationRunner默认在CommandLineRunner前运行
 *
 * You can additionally implement the org.springframework.core.Ordered interface
 * or use the org.springframework.core.annotation.Order annotation
 * if several CommandLineRunner or ApplicationRunner beans are defined that must be called in a specific order.
 */
@Component
public class MyApplicationRunner implements ApplicationRunner,Ordered {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("applicationRunner.......");
    }

    @Override
    public int getOrder() {
        return 1;
    }
}
