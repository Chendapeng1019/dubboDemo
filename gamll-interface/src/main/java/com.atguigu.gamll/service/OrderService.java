package com.atguigu.gamll.service;

import com.atguigu.gamll.bean.UserAddress;

import java.util.List;

/*

 *@ClassName OrderService
 *@Description
 *@Author chendapeng
 *@Date 2019/1/7
 */
public interface OrderService {

    /**
     * 初始化订单
     *
     * @param userId
     */
    public List<UserAddress> initOrder(String userId);
}
