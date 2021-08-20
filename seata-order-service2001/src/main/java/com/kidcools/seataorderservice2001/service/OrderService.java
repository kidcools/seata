package com.kidcools.seataorderservice2001.service;

import com.kidcools.seata.common.utils.R;
import com.kidcools.seataorderservice2001.domain.Order;

public interface OrderService {
    public R createOrder(Order order);
}
