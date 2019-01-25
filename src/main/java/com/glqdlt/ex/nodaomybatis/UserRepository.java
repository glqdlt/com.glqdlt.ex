package com.glqdlt.ex.nodaomybatis;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository {

    List<User> findAllUser();


}
