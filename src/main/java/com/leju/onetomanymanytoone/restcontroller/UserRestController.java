package com.leju.onetomanymanytoone.restcontroller;

import com.leju.onetomanymanytoone.model.User;
import com.leju.onetomanymanytoone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserRestController {

    @Autowired private UserService userService;

    @RequestMapping(method = RequestMethod.GET, value = "/all")
    public List<User> all() {
        return userService.findAll();
    }
}
