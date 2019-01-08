package com.atguigu.gmall.controller;/*
 *@ClassName OrderController
 *@Description
 *@Author chendapeng
 *@Date 2019/1/8
 */

import com.atguigu.gamll.bean.UserAddress;
import com.atguigu.gamll.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;

    @ResponseBody
    @RequestMapping("initOrder")
    public List<UserAddress> initOrder(@RequestParam("userId") String userId){
    return orderService.initOrder(userId);
    }
}
