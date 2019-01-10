package com.atguigu.gamll.service.impl;/*
 *@ClassName UserServiceImpl
 *@Description
 *@Author chendapeng
 *@Date 2019/1/7
 */

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gamll.bean.UserAddress;
import com.atguigu.gamll.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Service  //暴露服务*/
@Component
public class UserServiceImpl implements UserService {

    @HystrixCommand
    public List<UserAddress> getUserAddressList(String userId) {

        System.out.println("UserServiceImpl ...3 .....");
        UserAddress address1 = new UserAddress(1, "江西赣州信丰", "1", "cdp", "15079011666", "Y");
        UserAddress address2 = new UserAddress(2, "江西吉安", "2", "meng", "15079011666", "N");


        if(Math.random()>0.5){
            throw new RuntimeException();
        }
        return Arrays.asList(address1, address2);
    }
}
