package com.sedin.self.test;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 作者：REN
 * 创建时间：2017/12/26-21:59
 * 描述：系统在强制退出时不会调用到销毁程序，在异常发生退出时会调用退出销毁代码
 * Also, the ExitCodeGenerator interface may be implemented by exceptions. When such an exception is encountered,
 * Spring Boot will return the exit code provided by the implemented getExitCode() method.
 */
@SpringBootApplication
public class TestRunner implements DisposableBean {

    public static void main(String[] args) {
        SpringApplication.run(TestRunner.class,args);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("系统退出....");
    }
}
