package com.delicate.spring5_demo.controller;

import com.delicate.spring5_demo.bean.User;
import com.delicate.spring5_demo.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = "classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class HelloController {
    @Autowired
    private HelloService helloServiceImpl;

    @Test
    public void test() {
        User user = helloServiceImpl.findUserById(1);
        System.out.println(user);
    }
}
