package com.xupt.yzh.service.impl;

import com.xupt.yzh.dao.UserDao;
import com.xupt.yzh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public boolean exist(long uid) {
        return userDao.selectUserById(uid) > 0;
    }
}
