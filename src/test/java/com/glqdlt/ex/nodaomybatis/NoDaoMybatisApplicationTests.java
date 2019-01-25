package com.glqdlt.ex.nodaomybatis;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class NoDaoMybatisApplicationTests {

    @Resource
    private MyBatisUserDao myBatisUserDao;

    @Test
    public void contextLoads() {
    }

    @Test
    public void findAllUsers() {
        User u = new User();
        u.setId("test_user");
        myBatisUserDao.saveUser(u);
        List<User> aa = myBatisUserDao.findAllUser();
        Assert.assertEquals("test_user", aa.get(0).getId());
    }
}

