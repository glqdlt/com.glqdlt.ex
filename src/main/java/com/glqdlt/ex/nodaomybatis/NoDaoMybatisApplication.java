package com.glqdlt.ex.nodaomybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.glqdlt.ex.nodaomybatis")
@MapperScan(basePackages = "com.glqdlt.ex.nodaomybatis.**")
@SpringBootApplication
public class NoDaoMybatisApplication implements CommandLineRunner {

    @Autowired
    private UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(NoDaoMybatisApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        userService.findAllUser();
    }
}

