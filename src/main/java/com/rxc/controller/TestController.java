//MainController.java
package com.rxc.controller;
import com.rxc.dao.UserRepository;
import com.rxc.domain.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping("/")
    public String test() {
        System.out.println("CREATE START!");
        User user = new User();
        user.setId("TED");
        user.setPhoneNumber("01037541436");
        userRepository.saveAndFlush(user);

        user = new User();
        user.setId("TEDDY");
        user.setPhoneNumber("01037541437");
        userRepository.saveAndFlush(user);

        List<User> userList = userRepository.findAll();
        userList.stream().forEach(users -> System.out.println("## userInfo : " + users.getId() + " / " + users.getPhoneNumber()));

        User findUser = userRepository.findByPhoneNumber("01037541436");
        System.out.println("## findUserInfo : " + findUser.getId() + " / " + findUser.getPhoneNumber());

        return "SUCCESS";
    }
}