package com.kidcools.seataorderservice2001.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = {"com.kidcools.seataorderservice2001.mapper"})
public class MybatisConfig {

}
