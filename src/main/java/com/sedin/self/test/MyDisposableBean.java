package com.sedin.self.test;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

/**
 * 作者：REN
 * 创建时间：2017/12/26-22:22
 * 描述：
 */
@Component
public class MyDisposableBean implements DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("退出销毁.....");
    }
}
