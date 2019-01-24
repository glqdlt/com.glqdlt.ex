package com.glqdlt.ex.nodaomybatis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserRepo userRepo;

    public List<User> findAllUser(){

        List<User> ll = userRepo.findAllUser();

        logger.info(ll.toString());
        return ll;
    }

}
