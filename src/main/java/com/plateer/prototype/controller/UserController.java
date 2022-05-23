package com.plateer.prototype.controller;

import com.plateer.prototype.service.UserService;
import com.plateer.prototype.vo.Users;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @RequestMapping(value = "users", method = RequestMethod.GET)
    public List<Users> getUserList() {
        return userService.getUserList();
    };

    @RequestMapping(value = "countUsers")
    public Integer countUsers() {
        return userService.countUsers();
    };

}
