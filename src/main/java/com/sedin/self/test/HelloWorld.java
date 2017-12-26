package com.sedin.self.test;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 作者：REN
 * 创建时间：2017/12/20-22:21
 * 描述：
 */
//@Controller
//@EnableAutoConfiguration
//

/*@Configuration
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@ComponentScan*/

/*
    exclude是针对springBoot自己的类，采用自动装配的机制，
    告知应用程序，某些类不需要装配，个人理解我不需要加载到应用程序中
*/
@SpringBootApplication
public class HelloWorld {
    private static Logger log = LoggerFactory.getLogger(HelloWorld.class);

    @Autowired
    public NoAutoConfigClass noAuto;

//    public static void main(String[] args) {
//        System.out.println("Hello World!");
//    }

    public static void main(String[] args) throws Exception {
        log.info("hello world=============");
        //关闭默认在信息前打印的东西
        //也可以自定义显示的东西
        SpringApplication app = new SpringApplication(HelloWorld.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
        //ConfigurableApplicationContext run = SpringApplication.run(HelloWorld.class);

    }
}
