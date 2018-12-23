package com.leju.onetomanymanytoone.service.impl;

import com.leju.onetomanymanytoone.model.User;
import com.leju.onetomanymanytoone.repository.UserRepository;
import com.leju.onetomanymanytoone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
