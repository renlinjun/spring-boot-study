package com.sedin.self.test;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 作者：REN
 * 创建时间：2017/12/20-22:21
 * 描述：
 */
//@Controller
//@EnableAutoConfiguration
@SpringBootApplication
public class HelloWorld {
    private static Logger log = LoggerFactory.getLogger(HelloWorld.class);

//    public static void main(String[] args) {
//        System.out.println("Hello World!");
//    }

    public static void main(String[] args) throws Exception {
        log.info("hello world=============");
        ConfigurableApplicationContext run = SpringApplication.run(HelloWorld.class, args);
    }
}
