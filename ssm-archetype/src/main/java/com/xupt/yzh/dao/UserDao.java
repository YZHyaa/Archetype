package com.xupt.yzh.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {

    int selectUserById(long uid);
}
