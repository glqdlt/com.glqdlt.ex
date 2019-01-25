package com.glqdlt.ex.nodaomybatis;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MyBatisUserRepository extends UserRepo {

    @Select("select * from tb_user")
    @Override
    List<User> findAllUser();
}
