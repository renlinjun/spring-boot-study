package com.sedin.self.test;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * 作者：REN
 * 创建时间：2017/12/20-22:52
 * 描述：
 */
@RestController
//类似于包功能
@RequestMapping(value = "/person")
public class PersonController {

    @RequestMapping(value = "/getPerson",method = GET)
    //通过requestparam注解将接受到的参数绑定到方法的参数上
    //还可以定义required=true来确定该参数是否必须,默认为true
    public Person getPerson(@RequestParam(value = "name",required = false) String name, @RequestParam(value = "password") String password) {
        Person person = new Person();
        person.setName(name);
        person.setPassword(password);
        return person;
    }
}
