package com.kidcools.seataorderservice2001.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kidcools.seataorderservice2001.domain.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper extends BaseMapper<Order> {
}
