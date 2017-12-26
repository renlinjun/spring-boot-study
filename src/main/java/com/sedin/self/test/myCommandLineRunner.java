package com.sedin.self.test;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

/**
 * 作者：REN
 * 创建时间：2017/12/26-21:55
 * 描述：测试CommandLineRUnner在什么时候运行
 */
@Component
public class myCommandLineRunner implements CommandLineRunner,Ordered {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("commandLineRunner.......");
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
