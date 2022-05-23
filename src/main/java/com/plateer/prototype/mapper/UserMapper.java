package com.plateer.prototype.mapper;

import com.plateer.prototype.vo.Users;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    public List<Users> getUserList();
    public Integer countUsers();
}
