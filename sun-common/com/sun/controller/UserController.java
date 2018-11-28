package com.sun.controller;

import com.sun.ormMappings.User;
import com.sun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-10-16 19:00
 */
@RequestMapping("/user")
@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("getUserById")
    @ResponseBody
    public User getUserById(Integer id) {
        return userService.getUserById(id);
    }
}
