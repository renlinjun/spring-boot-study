package com.sedin.self.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 作者：REN
 * 创建时间：2017/12/20-22:21
 * 描述：
 */
//@Controller
//@EnableAutoConfiguration
@SpringBootApplication
public class HelloWorld {

//    public static void main(String[] args) {
//        System.out.println("Hello World!");
//    }

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        System.out.println("提交一下");
        SpringApplication.run(HelloWorld.class, args);
    }
}
