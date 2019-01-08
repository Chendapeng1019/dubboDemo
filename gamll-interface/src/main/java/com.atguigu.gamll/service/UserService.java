package com.atguigu.gamll.service;

import com.atguigu.gamll.bean.UserAddress;

import java.util.List;

/*
 *@ClassName UserService
 *@Description 用户服务
 *@Author chendapeng
 *@Date 2019/1/7
 */
public interface UserService {

    /**
     * 按照用户id返回收货地址
     *
     * @param userId
     * @return
     */
    public List<UserAddress> getUserAddressList(String userId);
}
