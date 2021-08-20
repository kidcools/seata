package com.kidcools.seataorderservice2001.service.impl;

import com.kidcools.seata.common.utils.R;
import com.kidcools.seataorderservice2001.domain.Order;
import com.kidcools.seataorderservice2001.mapper.OrderMapper;
import com.kidcools.seataorderservice2001.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderServiceImpl implements OrderService
{
    @Autowired
    private OrderMapper orderMapper;

    @Override
    @Transactional
    public R createOrder(Order order) {
        //远程调用 acount 和 storage 服务保存信息
        //插入order数据
        orderMapper.insert(order);
        return R.ok("添加成功").setData(order);
    }
}
