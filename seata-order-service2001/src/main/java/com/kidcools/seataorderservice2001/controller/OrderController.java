package com.kidcools.seataorderservice2001.controller;

import com.kidcools.seata.common.utils.R;
import com.kidcools.seataorderservice2001.domain.Order;
import com.kidcools.seataorderservice2001.mapper.OrderMapper;
import com.kidcools.seataorderservice2001.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;
    @RequestMapping("/order/add")
    public R createOrder(@RequestBody Order order){
        //创建Order
        R res = orderService.createOrder(order);
        System.out.println("hello kidcools1");
        System.out.println("hello kidcools2");

        System.out.println("hot-fix  修改了");
        return res;
    }
}
