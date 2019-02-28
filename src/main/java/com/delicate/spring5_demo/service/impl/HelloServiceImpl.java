package com.delicate.spring5_demo.service.impl;

import com.delicate.spring5_demo.bean.User;
import com.delicate.spring5_demo.dao.HelloDao;
import com.delicate.spring5_demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    @Autowired
    private HelloDao helloDao;

    public User findUserById(int id) {
        return helloDao.findUserById(id);
    }
}
