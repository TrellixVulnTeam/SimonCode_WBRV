package com.devperson;

import com.devperson.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestUserAccount {

    @Autowired
    IUserService userServiceImpl;

    @Test
    public void getAllUserAccount() {
        System.out.println(userServiceImpl.selectAllUser());;
    }
}
