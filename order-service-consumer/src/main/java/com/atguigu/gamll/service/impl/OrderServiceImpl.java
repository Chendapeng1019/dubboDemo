package com.atguigu.gamll.service.impl;/*
 *@ClassName OrderServiceImpl
 *@Description
 *@Author chendapeng
 *@Date 2019/1/7
 */

import com.atguigu.gamll.bean.UserAddress;
import com.atguigu.gamll.service.OrderService;
import com.atguigu.gamll.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 1.将服务提供者注册到注册中心
 * 1)、导入dubbo依赖（2.6.2） \操作zookeeper的客户端（curator）
 * 2)、配置服务提供者
 * 2.让服务消费者去注册中心订阅服务提供者的服务地址
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    UserService userService;

    public void initOrder(String userId) {

        System.out.println("用户id:" + userId);
        //1.查询用户的收获地址
        List<UserAddress> addressList = userService.getUserAddressList(userId);
        for (UserAddress userAddress : addressList) {
            System.out.println(userAddress);
        }

    }
}
