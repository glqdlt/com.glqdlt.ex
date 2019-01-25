package com.glqdlt.ex.nodaomybatis;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MyBatisUserDao extends UserRepository {

    @Select("select * from tb_user")
    @Override
    List<User> findAllUser();

    @Insert({"insert into tb_user(id) values (#{u.id})"})
    @Override
    void saveUser(@Param("u") User user);
}
