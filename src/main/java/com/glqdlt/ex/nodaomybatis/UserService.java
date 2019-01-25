package com.glqdlt.ex.nodaomybatis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

//    @Resource 는 @Qualifier 처럼 Bean 을 이름 기반으로 주입시켜주는 어노테이션입니다.
    @Resource
    private MyBatisUserRepository myBatisUserRepository;


    public List<User> findAllUser(){

        List<User> ll = myBatisUserRepository.findAllUser();

        logger.info(ll.toString());
        return ll;
    }

}
