package com.atguigu.gamll.service.impl;/*
 *@ClassName UserServiceStub
 *@Description
 *@Author chendapeng
 *@Date 2019/1/8
 */

import com.atguigu.gamll.bean.UserAddress;
import com.atguigu.gamll.service.UserService;
import org.springframework.util.StringUtils;

import java.util.List;

public class UserServiceStub implements UserService {

    private final UserService userService;

    public UserServiceStub(UserService userService) {
        super();
        this.userService = userService;
    }

    public List<UserAddress> getUserAddressList(String userId) {
        System.out.println("UserServerStu.......");
      if(!StringUtils.isEmpty(userId)){
          return userService.getUserAddressList(userId);
      }
      return null;
    }
}
