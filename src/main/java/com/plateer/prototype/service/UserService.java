package com.plateer.prototype.service;

import com.plateer.prototype.vo.Users;

import java.util.List;

public interface UserService {

    public List<Users> getUserList();

    public Integer countUsers();
}
