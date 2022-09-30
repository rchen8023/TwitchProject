package com.ruichen.twitchproject.service;

import com.ruichen.twitchproject.dao.RegisterDao;
import com.ruichen.twitchproject.entity.db.User;
import com.ruichen.twitchproject.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class RegisterService {

    @Autowired
    private RegisterDao registerDao;

    public boolean register(User user) throws IOException {
        user.setPassword(Util.encryptPassword(user.getUserId(), user.getPassword()));
        return registerDao.register(user);
    }
}

