package com.atguigu.gmall.service.impl;/*
 *@ClassName UserServiceImpl
 *@Description
 *@Author chendapeng
 *@Date 2019/1/7
 */

import com.atguigu.gamll.bean.UserAddress;
import com.atguigu.gamll.service.UserService;

import java.util.Arrays;
import java.util.List;

public class UserServiceImpl2 implements UserService {

    public List<UserAddress> getUserAddressList(String userId) {

        System.out.println("UserServiceImpl ... .. new..");

        UserAddress address1 = new UserAddress(1, "江西赣州信丰", "1", "cdp", "15079011666", "Y");
        UserAddress address2 = new UserAddress(2, "江西吉安", "2", "meng", "15079011666", "N");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Arrays.asList(address1, address2);
    }
}
