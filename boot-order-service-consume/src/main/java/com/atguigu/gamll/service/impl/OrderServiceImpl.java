package com.atguigu.gamll.service.impl;/*
 *@ClassName OrderServiceImpl
 *@Description
 *@Author chendapeng
 *@Date 2019/1/7
 */

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gamll.bean.UserAddress;
import com.atguigu.gamll.service.OrderService;
import com.atguigu.gamll.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * 1.将服务提供者注册到注册中心
 * 1)、导入dubbo依赖（2.6.2） \操作zookeeper的客户端（curator）
 * 2)、配置服务提供者
 * 2.让服务消费者去注册中心订阅服务提供者的服务地址
 */
@Service
public class OrderServiceImpl implements OrderService {

    /*@Autowired*/
    @Reference
    UserService userService;

    @HystrixCommand(fallbackMethod = "hello")  //一旦出错回调hello方法
    public List<UserAddress> initOrder(String userId) {

        System.out.println("用户id:" + userId);
        //1.查询用户的收获地址
        List<UserAddress> addressList = userService.getUserAddressList(userId);
        for (UserAddress userAddress : addressList) {
            System.out.println(userAddress);
        }
       return addressList;
    }

    public List<UserAddress> hello(String userId) {

        return Arrays.asList(new UserAddress(10,"测试地址","1","测试","测试","Y"));
    }
}
